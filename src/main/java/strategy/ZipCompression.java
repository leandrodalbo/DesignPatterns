package strategy;

public class ZipCompression implements CompressionStrategy{
    @Override
    public void compress() {
        System.out.println("zip compression");
    }
}
