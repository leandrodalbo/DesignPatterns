package factoryMethod;

public class PNGFactory implements ImageFactory {
    @Override
    public LocalImage getImage() {
        return new PNGImage();
    }
}
