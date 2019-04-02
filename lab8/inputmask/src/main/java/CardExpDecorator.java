public class CardExpDecorator extends Decorator {

    String addedState;

    public CardExpDecorator(Widget c) {
        super(c);
    }

    @Override
    public String display() {
        addedState = super.display();
        return expFormat(addedState);
    }

    private String expFormat(String in) {
        StringBuilder sb = new StringBuilder();
        int offset = 0;
        int length = in.length();
        if (length > 4) {
            sb.append(in.substring(0, 3) + "/");
            offset = 3;
        }
        sb.append(in.substring(offset, length) + "  ");

        return sb.toString();
    }
}
