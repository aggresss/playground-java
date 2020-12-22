package cn.router7.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        // eagerly initialized singleton
        var ivoryTower1 = IvoryTower.getInstance();
        var ivoryTower2 = IvoryTower.getInstance();
        log.info("ivoryTower1={}", ivoryTower1);
        log.info("ivoryTower2={}", ivoryTower2);

        // lazily initialized singleton
        var threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        var threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        log.info("threadSafeIvoryTower1={}", threadSafeIvoryTower1);
        log.info("threadSafeIvoryTower2={}", threadSafeIvoryTower2);

        // enum singleton
        var enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        var enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        log.info("enumIvoryTower1={}", enumIvoryTower1);
        log.info("enumIvoryTower2={}", enumIvoryTower2);

        // double checked locking
        var dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
        log.info(dcl1.toString());
        var dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
        log.info(dcl2.toString());

        // initialize on demand holder idiom
        var demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
        log.info(demandHolderIdiom.toString());
        var demandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        log.info(demandHolderIdiom2.toString());
    }
}