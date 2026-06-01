package hw.ch19;

public class UrgentState implements State {
    private static UrgentState singleton = new UrgentState();

    private UrgentState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 상태 유지
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상: 금고 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("비상 통화");
    }

    public String toString() {
        return "[비상시]";
    }
}