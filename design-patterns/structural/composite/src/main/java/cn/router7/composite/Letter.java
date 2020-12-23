package cn.router7.composite;

public class Letter extends LetterComposite {

    private final char character;

    public Letter(char c) {
        this.character = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
