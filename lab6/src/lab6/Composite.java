package lab6;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<>();
    private String description;
    private double price;
    private PrintStrategy strategy;

    public Composite(String d, double price) {
        this.description = d;
        this.price = price;
        strategy = new ReceiptStrategy();
    }

    @Override
    public void addSubComponent(Component c) {
        components.add(c);
    }

    @Override
    public String display() {
        return strategy.print(description, price, components);
    }

    public void changeStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

}
