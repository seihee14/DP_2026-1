package hw.ch02;

public class Main {

    public static void main(String[] args) {
        System.out.println("20240827 조세희");

        KoreanOutlet outlet = new KoreanOutlet();

        KoreanOutletAdapter adapter = new KoreanOutletAdapter(outlet);

        Smartphone phone = new Smartphone(adapter);

        phone.charge();
    }
}