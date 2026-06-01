package practice.ch10;

public class Main {
    public static void main(String[] args) { // args : 명령행 인자를 받는 변수
        /* 
        Hand h1 = Hand.ROCK;
        Hand h2 = Hand.SCISSORS;

        h1.isStrongerThan(h2) {
            System.out.println(h1 + "이 " + h2 + "보다 강하다.");
        } else if (h1.isWeakerThan(h2)) {
            System.out.println(h1 + "이 " + h2 + "보다 약하다.");
        } else {
            System.out.println(h1 + "과 " + h2 + "는 비겼다.");
        }
        */

        // 플레이어 2명 생성
        Player player1 = new Player("조황", new WinningStrategy(seed : 314));
        Player player2 = new Player("홍철", new WinningbStrategy(seed : 15));

        // 게임 시키기
        for (int i = 0; i < 10000; i++) {
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (h1.isWeakerThan(h2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }

    }
}
