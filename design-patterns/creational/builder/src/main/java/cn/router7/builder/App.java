package cn.router7.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        var mage = new Hero.Builder(Profession.MAGE, "Fiobard").withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER)
                .build();
        log.info(mage.toString());

        var warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill").withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD).build();
        log.info(warrior.toString());

        var thief = new Hero.Builder(Profession.THIEF, "Desmond").withHairType(HairType.BALD).withWeapon(Weapon.BOW)
                .build();
        log.info(thief.toString());
    }
}
