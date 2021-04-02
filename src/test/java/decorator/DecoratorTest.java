package decorator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DecoratorTest {

    DecoratedComponent component = new ComponentX();

    @Test
    public void shouldBeAbleToPerformADefaultAction() {
        assertTrue(component.performDefaultAction());
    }

    @Test
    public void shouldBeAbleToDecorateTheComponentWithFeatureY() {
        FeatureY componentWithFeatureY = new FeatureY(component);
        assertTrue(componentWithFeatureY.canPerformFeatureY());
    }

}
