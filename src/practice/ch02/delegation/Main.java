package practice.ch02.delegation;

public class Main {
    Print print = new PrintBannerAdapter02(text: "Hello World");
    print.printWeak();
    print.printStrong();
}
