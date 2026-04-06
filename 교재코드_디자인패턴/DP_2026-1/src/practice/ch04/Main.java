import ch04.A2.idcard.IDCardFactory;
import java.util.Map;
 
 public class Main {
     public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
         Product card1 = factory.create("Youngjin Kim");
         Product card2 = factory.create("Heungmin Son");
         Product card3 = factory.create("Kane");
         card1.use();
         card2.use();
         card3.use();
        
        // 생성된 HashMap 테스트
        System.out.println("\n=== HashMap 내용 ===");
        Map<Integer, String> database = factory.getDatabase();
        for (Integer serial : database.keySet()) {
            System.out.println("시리얼: " + serial + ", 오너: " + database.get(serial));
        }
     }
 }