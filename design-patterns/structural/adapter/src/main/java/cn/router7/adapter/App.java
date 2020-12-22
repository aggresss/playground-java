package cn.router7.adapter;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
