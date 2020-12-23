package cn.router7.composite;

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
        log.info("Message from the orcs: ");

        var orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        log.info("\nMessage from the elves: ");

        var elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
