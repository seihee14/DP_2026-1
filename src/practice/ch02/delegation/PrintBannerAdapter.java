package practice.ch02.delegation;

// 어댑터 
// 자바 다중 상속 불가
public class PrintBannerAdapter extends Print {
    private Banner banner; //Banner 클래스의 인스턴스를 참조하는 필드

    private PrintBannerAdapter02(String text) {
        this.banner = new Banner(text); // Banner  클래스의 인스턴스를 생성하여 필드에 할당
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // Banner 클래스의 메서드를 호출하여 기능을 수행(위임)
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // Banner 클래스의 메서드의 메서드를 호출하여 기능을 수행(위임)
    }
    

    }
}
