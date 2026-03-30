package practice.ch03;

public class Main {

    public static void main(String[] args) {
//        CharDisplay d1 = new CharDisplay(ch: 'H');
        AbstractDisplay d1 = new CharDisplay(ch:'H');
        d1.display();
        

        AbstractDisplay d2 = new CharDisplay(string:'Hello World');
        d2.display();

        //추상클래스 인스턴스 만들 수 없음

    }
    
}
