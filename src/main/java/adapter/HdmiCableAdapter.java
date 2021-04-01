package adapter;

public class HdmiCableAdapter implements CableAdapter {

    @Override
    public boolean plugIn(PortService portService) {
        return portService.connect();
    }
}
