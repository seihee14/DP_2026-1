package practice.ch04;
import practice.ch04.idcard.IDCard;
public class Main {
    public static void main(String[] args){
        //(1) 직접 만들기
        //  IDCard c = new IDCard("조황");
        //c.use();
        IDCardFactory f = new IDCardFactory();
        IDCard c = f.create(owner: "조황");
        c.use();
    }
    
}