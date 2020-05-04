package events;

public class LedStateSensor {

    private enum Color { Red, Green };

    private final Color ledColor;

    public LedStateSensor(Color ledColor) {
        this.ledColor = ledColor;
    }

    public Color getLedColor() {
        return ledColor;
    }

}
