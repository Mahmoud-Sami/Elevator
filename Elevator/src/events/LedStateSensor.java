package events;

public class LedStateSensor {

    private boolean ledstate;

    public LedStateSensor(boolean ledstate) {
        this.ledstate = ledstate;
    }

    public boolean isLedstate() {
        return ledstate;
    }

}
