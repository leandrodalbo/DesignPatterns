package factoryMethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class ImageFactoryTest {

    @Test
    public void shouldCreatePNGImage()
    {
        ImageFactory factory = new PNGFactory();

        LocalImage image = factory.getImage();

        assertThat(image, instanceOf(PNGImage.class));

    }


    @Test
    public void shouldCreateJPGImage()
    {
        ImageFactory factory = new JpgFactory();

        LocalImage image = factory.getImage();

        assertThat(image, instanceOf(JPGImage.class));

    }
}
