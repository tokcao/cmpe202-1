public class CardNumDecorator extends Decorator {

    String addedState;

    public CardNumDecorator(Widget c) {
        super(c);
    }

    @Override
    public String display() {
        addedState = super.display();
        return numFormat(addedState);
    }

    private String numFormat(String in) {
        StringBuilder sb = new StringBuilder();
        int offset = 0;
        int length = in.length();
        if (length > 6) {
            sb.append(in.substring(0, 5) + " ");
            offset = 5;
        }
        if (length > 10) {
            sb.append(in.substring(5, 9) + " ");
            offset = 9;
        }
        if (length > 14) {
            sb.append(in.substring(9, 13) + " ");
            offset = 13;
        }
        sb.append(in.substring(offset, length) + "  ");

        return sb.toString();
    }
}
