package events;

public class CarCallEvent {

    private final int FloorNumber;

    public CarCallEvent(int FloorNumber) {
        this.FloorNumber = FloorNumber;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

}
