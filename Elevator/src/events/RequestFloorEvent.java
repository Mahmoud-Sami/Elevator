package events;

public class RequestFloorEvent {

    private final int floorNumber;
    
    public RequestFloorEvent(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

}
