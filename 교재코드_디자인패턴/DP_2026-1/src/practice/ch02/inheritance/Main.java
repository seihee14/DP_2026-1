package practice.ch02.inheritance;

// 이미 제공되는 클래스, vendor 클래스 수정 불가
public class Main{
    public static void main(String[] args){
        Banner banner = new Banner(string: "Hello World");

        banner.showWithParen();

        banner.showWithAster();

        //어댑터 이용
        System.out.print(x: "==어댑터 이용==");
        Print print = new PrintBannerAdapter01(string:"Hello World");
        print.printWeak();
        print.printStrong();
        

    }
}