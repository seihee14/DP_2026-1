package hw.ch20;

public class Main {


    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";
    static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        System.out.println("20240827/조세희");
        if (args.length == 0) {
            System.out.println("Usage: java Main 1212123");
            return;
        }

        BigString bs = new BigString(args[0]);

        String[] colors = {
            RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE
        };

        bs.print(colors);
    }
}