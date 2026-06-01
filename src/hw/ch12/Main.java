package hw.ch12;

public class Main {
    public static void main(String[] args) {

        System.out.println("20240827/조세희");
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful.");

        md.show();
        System.out.println();

        Display d1 = new NumberedBorder(md);
        d1.show();
        System.out.println();

        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();
        System.out.println();

        Display d3 = new SideBorder(
                        new NumberedBorder(
                            new FullBorder(md)
                        ), '*');
        d3.show();
    }
}