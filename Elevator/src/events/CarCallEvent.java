package events;

public class CarCallEvent {

    public enum Direction { UP, DOWN };
    
    private final int floorNumber;
    private final Direction direction;
    
    public CarCallEvent(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    
}
