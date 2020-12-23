package cn.router7.flyweight;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AlchemistShop holds potions on its shelves. It uses PotionFactory to provide
 * the potions.
 */
public class AlchemistShop {

    private static final Logger log = LoggerFactory.getLogger(AlchemistShop.class);

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    /**
     * Constructor.
     */
    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(factory.createPotion(PotionType.INVISIBILITY), factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.STRENGTH), factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY), factory.createPotion(PotionType.STRENGTH),
                factory.createPotion(PotionType.HEALING), factory.createPotion(PotionType.HEALING));
        bottomShelf = List.of(factory.createPotion(PotionType.POISON), factory.createPotion(PotionType.POISON),
                factory.createPotion(PotionType.POISON), factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER));
    }

    /**
     * Get a read-only list of all the items on the top shelf.
     *
     * @return The top shelf potions
     */
    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    /**
     * Get a read-only list of all the items on the bottom shelf.
     *
     * @return The bottom shelf potions
     */
    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    /**
     * Enumerate potions.
     */
    public void enumerate() {
        log.info("Enumerating top shelf potions\n");
        topShelf.forEach(Potion::drink);
        log.info("Enumerating bottom shelf potions\n");
        bottomShelf.forEach(Potion::drink);
    }
}
