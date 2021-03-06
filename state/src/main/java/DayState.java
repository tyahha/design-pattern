public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {
    }
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("use safe in day");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("emergency alarm in day");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("normal call in day");
    }

    @Override
    public String toString() {
        return "[day]";
    }
}
