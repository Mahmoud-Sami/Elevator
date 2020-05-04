package events;

public class DoorStateSensor {

    private boolean doorstate;

    public DoorStateSensor(boolean doorstate) {
        this.doorstate = doorstate;
    }

    public boolean isDoorstate() {
        return doorstate;
    }

}
