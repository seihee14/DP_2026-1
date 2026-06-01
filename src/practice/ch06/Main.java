package practice.ch06;

import ch06.A1a.framework.Manager;

public class Main {
    public static void main(String[] args) {
        //메인 메서드 내용
        /* 
        MessageBox mbox1 = new MessageBox('*');
        mbox1.use("Hello, world.");

        UnderlinePen upen1 = new UnderlinePen('-');
        upen1.use("Hello, world.");

        //복제 객체 이용
        mbox1.createCopy().use("Hello, world.");
        upen1.createCopy().use("Hello, world.");

        */
        // 준비
        Manager manager = new Manager();

        // 원본 객체 생성 및 등록
        MessageBox mbox1 = new MessageBox('*');
        manager.register("strong message", mbox1);

        UnderlinePen upen1 = new UnderlinePen('-');
        manager.register("warning message", upen1);

        MessageBox mbox2 = new MessageBox('/');
        manager.register("slash message", mbox2);
    }
    
}
