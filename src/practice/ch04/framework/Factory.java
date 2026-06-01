package practice.ch04.framework;

public abstract class Factory {
    // 템플릿 메소드
    public final Product create(String owner) { //실제 제품 생성
        //예 : 실제로는 IDCard 객체가 생성되지만, 부모 타입으로 받을 수 있다.
        Product p = createProduct(owner); //실제 제품 생성
        registerProduct(p); // 
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
