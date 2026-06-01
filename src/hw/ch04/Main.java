package hw.ch04;

import hw.ch04.license.LicenseCardFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240827 조세희");
        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        System.out.println("-----------");

    Factory factory2 = new LicenseCardFactory("2026-03-20");

    Product license1 = factory2.create("Park Jisung");
    Product license2 = factory2.create("Lee Min-jae");

    license1.use();
    license2.use();
    }
}
