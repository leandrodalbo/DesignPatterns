package decorator;

public class FeatureDecorator extends DecoratedComponent{

    private DecoratedComponent component;

    public FeatureDecorator(DecoratedComponent component)
    {
        super();
        this.component = component;
    }

    @Override
    public boolean performDefaultAction() {
        return this.component.performDefaultAction();
    }

}
