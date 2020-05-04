package events;

public class DoorStateSensor {

    private final boolean doorState;

    public DoorStateSensor(boolean doorState) {
        this.doorState = doorState;
    }

    public boolean isDoorstate() {
        return doorState;
    }

}
