package lab6;

public class BotDecorator extends Decorator {

    private String addedState;

    public BotDecorator(Component c) {
        super(c);
    }

    @Override
    public String display() {
        addedState = super.display();
        return addedBehavior(addedState);
    }

    private String addedBehavior(String in) {
        return " {{{{ " + in + " }}}}";
    }
}
