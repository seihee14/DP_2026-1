package practice.ch05.ex;

public class Main extends Thread{

    public static void main(String[] args) {
        //스레드를 두 개 만듦
        Thread a = new Main(name: "Thread A");
        Thread b = new Main(name: "Thread B");
        Thread c = new Main(name: "Thread C");

        // 스레드를 시작함
        a.start();
        b.start();
        c.start();

    }


    @Override
    //Thread의 run() 메서드를 오버라이드
    //이 스레드가 실행할 코드
    public void run() {
        Singleton s = Singleton.getInstance(); // 싱글톤 인스턴스를 얻는다
        System.out.println(getName() + ": " + s); //인스턴스의 참조값을 출력

    }
    public Main(String name) {
        super(name); // Thread 클래스의 생성자에 이름을 전달
    }
}
