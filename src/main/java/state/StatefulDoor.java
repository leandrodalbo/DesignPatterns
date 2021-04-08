package state;

public class StatefulDoor {
    private DoorState state;

    public StatefulDoor() {
        this.state = new ClosedDoor();
    }

    public boolean isClosed() {
        return (this.state.getStateKey().equals(StateKeys.CLOSED.getKey()));
    }

    public boolean isOpen() {
        return (this.state.getStateKey().equals(StateKeys.OPEN.getKey()));
    }

    public void open() {

        if (this.state.getStateKey().equals(StateKeys.CLOSED.getKey())) {
            this.state = new OpenDoor();
        }
    }

    public void close() {

        if (this.state.getStateKey().equals(StateKeys.OPEN.getKey())) {
            this.state = new ClosedDoor();
        }
    }
}
