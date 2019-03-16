package lab6;

import java.util.ArrayList;
import java.util.Collections;

public class PackingStrategy implements PrintStrategy {

    @Override
    public String print(String description, double price, ArrayList<Component> components) {
        // Sort first
        ArrayList<Component> components_cp = new ArrayList<>(components);
        Collections.sort(components_cp, (Component c1, Component c2) -> {
            if (c2.getClass() == TopDecorator.class) return 1;
            if (c1.getClass() == TopDecorator.class) return -1;
            if (c2.getClass() == MidDecorator.class) return 1;
            if (c1.getClass() == MidDecorator.class) return -1;
            return 0;
        });

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s%n", description));

        for(Component c: components_cp) {
            sb.append(c.display() + '\n');
        }

        return sb.toString();
    }
}
