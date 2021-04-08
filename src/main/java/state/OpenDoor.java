package state;

public class OpenDoor extends DoorState {
    @Override
    public String getStateKey() {
        return StateKeys.OPEN.getKey();
    }
}
