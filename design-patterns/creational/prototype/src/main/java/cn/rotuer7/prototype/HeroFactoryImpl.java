package cn.rotuer7.prototype;

public class HeroFactoryImpl implements HeroFactory {

    private final Mage mage;
    private final Warlord warlord;
    private final Beast beast;

    public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
      }

      /**
       * Create mage.
       */
      public Mage createMage() {
        return mage.copy();
      }

      /**
       * Create warlord.
       */
      public Warlord createWarlord() {
        return warlord.copy();
      }

      /**
       * Create beast.
       */
      public Beast createBeast() {
        return beast.copy();
      }
}
