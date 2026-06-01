package ch17.A1;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 동지 받는 메소드
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
