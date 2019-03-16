package lab6;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component c) {
        this.component = c;
    }

    @Override
    public void addSubComponent(Component c) {

    }

    @Override
    public String display() {
        return component.display();
    }
}
