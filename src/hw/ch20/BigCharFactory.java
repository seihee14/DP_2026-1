package hw.ch20;
import java.util.HashMap;

public class BigCharFactory {
    private HashMap<Character, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get(charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(charname, bc);
        }
        return bc;
    }
}
