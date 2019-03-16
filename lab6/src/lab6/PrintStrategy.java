package lab6;

import java.util.ArrayList;

public interface PrintStrategy {
    String print(String description, double price, ArrayList<Component> components);
}
