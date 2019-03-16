package lab6;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DecimalFormat fmt = new DecimalFormat("0.00");

        Composite lbb = new Composite("LBB", 5.59);
        lbb.addSubComponent(new BotDecorator(new Bacon()));
        lbb.addSubComponent(new TopDecorator(new Lettuce()));
        lbb.addSubComponent(new TopDecorator(new Tomato()));
        lbb.addSubComponent(new MidDecorator(new Onion()));
        lbb.addSubComponent(new MidDecorator(new Jalapeno()));
        Composite ltl = new Composite("LTL CAJ", 2.79);
        System.out.println(StringUtils.center("Five Guys", 30));
        System.out.print(lbb.display());
        System.out.print(ltl.display());
        System.out.println();
        System.out.print(String.format("%-15s %15s%n", "Sub. Total:", "$" + fmt.format(8.38)));
        System.out.print(String.format("%-15s %15s%n", "Tax:", "$" + fmt.format(0.76)));
        System.out.print(String.format("%-15s %15s%n", "Total:", "$" + fmt.format(9.14)));
        System.out.println();
        System.out.print(String.format("%-15s %15s%n", "Cash $20", "$" + fmt.format(20)));
        System.out.print(String.format("%-15s %15s%n", "Change", "$" + fmt.format(10.86)));


        System.out.println();
        System.out.println();
        System.out.println();

        PrintStrategy strategy = new PackingStrategy();
        lbb.changeStrategy(strategy);
        ltl.changeStrategy(strategy);
        System.out.println(StringUtils.center("Five Guys", 30));
        System.out.print(lbb.display());
        System.out.print(ltl.display());


    }
}
