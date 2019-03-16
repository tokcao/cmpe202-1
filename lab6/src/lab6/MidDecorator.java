package lab6;

public class MidDecorator extends Decorator {

    private String addedState;

    public MidDecorator(Component c) {
        super(c);
    }

    @Override
    public String display() {
        addedState = super.display();
        return addedBehavior(addedState);
    }

    private String addedBehavior(String in) {
        return " ->| " + in;
    }
}
