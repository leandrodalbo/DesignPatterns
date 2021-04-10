package strategy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class FileCompressorManagerTest {

    @Test
    public void shouldGetASingletonInstance() {
        FileCompressorManager manager = FileCompressorManager.getInstance();
        FileCompressorManager manager1 = FileCompressorManager.getInstance();

        assertTrue(manager.hashCode() == manager1.hashCode());
    }

    @Test
    public void shouldBeAbleToUseZipOption() {
        FileCompressorManager manager = FileCompressorManager.getInstance();

        ZipCompression zipCompression = mock(ZipCompression.class);
        manager.setStrategy(zipCompression);

        manager.compress();

        verify(zipCompression, times(1)).compress();
    }

    @Test
    public void shouldBeAbleToUsRarOption() {
        FileCompressorManager manager = FileCompressorManager.getInstance();

        RarCompression rarCompression = mock(RarCompression.class);
        manager.setStrategy(rarCompression);

        manager.compress();

        verify(rarCompression, times(1)).compress();
    }

}
