package events;

public class EmergencyEvent {

    private final boolean trigger_emergency;

    public EmergencyEvent(boolean trigger_emergency) {
        this.trigger_emergency = trigger_emergency;
    }

    public boolean isTrigger_emergency() {
        return trigger_emergency;
    }

}
