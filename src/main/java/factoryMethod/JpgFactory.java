package factoryMethod;

public class JpgFactory implements ImageFactory {
    @Override
    public LocalImage getImage() {
        return new JPGImage();
    }
}
