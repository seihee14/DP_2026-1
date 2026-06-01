package hw.ch03;


public class Main {
    public static void main(String[] args) {
        System.out.println("20240827  조세희");

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        d1.display();
        d2.display();

        System.out.println("-----");


        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);

        d3.display();
        d4.display();

        System.out.println("-----");

        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}