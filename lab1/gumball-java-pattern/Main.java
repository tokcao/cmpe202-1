

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 25, new int[]{25});

		System.out.println(gumballMachine);

		gumballMachine.insertMoney(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertMoney(25);
		gumballMachine.turnCrank();
		gumballMachine.insertMoney(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
