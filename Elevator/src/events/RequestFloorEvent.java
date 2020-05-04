package events;

public class RequestFloorEvent {

    private int floorno;

    public RequestFloorEvent(int floorno) {
        this.floorno = floorno;
    }

    public int getFloorno() {
        return floorno;
    }

}
