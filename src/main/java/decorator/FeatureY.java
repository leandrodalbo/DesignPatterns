package decorator;

public class FeatureY extends  FeatureDecorator {

    public FeatureY(DecoratedComponent component) {
        super(component);
    }

    public boolean canPerformFeatureY()
    {
        return true;
    }
}
