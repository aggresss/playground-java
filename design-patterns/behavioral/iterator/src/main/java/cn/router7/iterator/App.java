package cn.router7.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cn.router7.iterator.list.ItemType.ANY;
import static cn.router7.iterator.list.ItemType.POTION;
import static cn.router7.iterator.list.ItemType.RING;
import static cn.router7.iterator.list.ItemType.WEAPON;

import cn.router7.iterator.bst.BstIterator;
import cn.router7.iterator.bst.TreeNode;
import cn.router7.iterator.list.ItemType;
import cn.router7.iterator.list.TreasureChest;

/**
 * The Iterator pattern is a design pattern in which an iterator is used to
 * traverse a container and access the container's elements. The Iterator
 * pattern decouples algorithms from containers.
 *
 * <p>
 * In this example the Iterator ({@link Iterator}) adds abstraction layer on top
 * of a collection ({@link TreasureChest}). This way the collection can change
 * its internal implementation without affecting its clients.
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        log.info("------------------------");
        log.info("Item Iterator for ItemType " + itemType + ": ");
        var itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            log.info(itemIterator.next().toString());
        }
    }

    private static void demonstrateBstIterator() {
        log.info("------------------------");
        log.info("BST Iterator: ");
        var root = buildIntegerBst();
        var bstIterator = new BstIterator<>(root);
        while (bstIterator.hasNext()) {
            log.info("Next node: " + bstIterator.next().getVal());
        }
    }

    private static TreeNode<Integer> buildIntegerBst() {
        var root = new TreeNode<>(8);

        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        return root;
    }

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);

        demonstrateBstIterator();
    }
}
