package adapter;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CableAdapterTest {

    @Test
    public void shouldBeAbleToUseTheHdmiCableWithMiniDisplayPort() {
        CableAdapter adapter = new HdmiCableAdapter();
        assertTrue(adapter.plugIn(new MiniDisplayPortService()));
    }

    @Test
    public void shouldBeAbleToUseTheHdmiCableWithVGAService() {
        CableAdapter adapter = new HdmiCableAdapter();
        assertTrue(adapter.plugIn(new VGAPortService()));
    }
}
