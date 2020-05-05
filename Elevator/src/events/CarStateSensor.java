package events;

public class CarStateSensor {

    public enum CarDirection { UP, DOWN, None };
    
    private final CarDirection carDir;
    private final boolean isMoving;
    private final int carPositionY;
    private final int currentFloor;
    
    public CarStateSensor(CarDirection carDir, boolean isMoving, int carPositionY, int currentFloor) {
        this.carDir = carDir;
        this.isMoving = isMoving;
        this.carPositionY = carPositionY;
        this.currentFloor = currentFloor;
    }

    public CarDirection getCarDir() {
        return carDir;
    }

    public boolean isIsMoving() {
        return isMoving;
    }

    public int getCarPositionY() {
        return carPositionY;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    
    
    
}
