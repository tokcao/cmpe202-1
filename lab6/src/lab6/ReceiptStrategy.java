package lab6;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ReceiptStrategy implements PrintStrategy {

    @Override
    public String print(String description, double price, ArrayList<Component> components) {
        StringBuilder sb = new StringBuilder();
        DecimalFormat fmt = new DecimalFormat("0.00");

        sb.append(String.format("%-15s %15s%n", description, fmt.format(price)));

        for(Component c: components) {
            sb.append(c.display() + '\n');
        }

        return sb.toString();
    }
}
