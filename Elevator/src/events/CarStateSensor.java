package events;

public class CarStateSensor {

    private enum CarDirection { UP, DOWN };
    
    private final CarDirection carDir;
    private final boolean isMoving;

    public CarStateSensor(CarDirection carDir, boolean isMoving) {
        this.carDir = carDir;
        this.isMoving = isMoving;
    }

    public CarDirection getCarDir() {
        return carDir;
    }

    public boolean isIsMoving() {
        return isMoving;
    }
    
}
