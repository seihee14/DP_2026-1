package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // Product: 부모 타입 -> 모든 종류의 자식 Product 객체를 관리할 수 있음
    private Map<String,Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
