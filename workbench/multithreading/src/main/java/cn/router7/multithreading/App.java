package cn.router7.multithreading;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    public void run() {
        System.out.println( "Hello World!" );
    }

    public static void main( String[] args )
    {
        var app = new App();
        app.run();
    }
}
