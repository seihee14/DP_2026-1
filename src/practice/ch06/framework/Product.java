package practice.ch06.framework;

//Product 인터페이스는 구현한 클래스는 clon() 메소드를 제공한다
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy(); //복제 메소드
}
