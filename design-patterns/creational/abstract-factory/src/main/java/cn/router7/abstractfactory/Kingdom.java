package cn.router7.abstractfactory;

public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    public King getKing() {
        return king;
    }

    public Army getArmy() {
        return army;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public static class FactoryMaker {
        public enum KingdomType {
            ELF,
            ORC
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                return new ElfKingdomFactory();
                case ORC:
                return new OrcKingdomFactory();
                default:
                throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }
}

