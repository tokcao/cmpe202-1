/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.regex.Pattern;

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;
    private final Pattern INPUT_PATTERN = Pattern.compile("\\d|X");

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(new CardNumDecorator(num));
        screen.addSubComponent(new CardExpDecorator(exp));
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if (INPUT_PATTERN.matcher(ch).matches()){
            if (ch.equals("X")) {
                count = Math.max(0, --count);
            } else {
                count = Math.min(++count, 23);
            }
            screen.key(ch, count);
        }
    }

}

