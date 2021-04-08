package state;

public class ClosedDoor extends DoorState {
    @Override
    public String getStateKey() {
        return StateKeys.CLOSED.getKey();
    }
}
