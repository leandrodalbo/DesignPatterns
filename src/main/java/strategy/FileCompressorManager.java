package strategy;

public class FileCompressorManager {

    private static FileCompressorManager instance = null;
    private CompressionStrategy strategy;

    private FileCompressorManager() {
    }

    public static FileCompressorManager getInstance() {
        if (instance == null) {
            instance = new FileCompressorManager();
        }

        return instance;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress() {
        this.strategy.compress();
    }
}
