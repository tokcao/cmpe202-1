

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertMoney() {
        System.out.println("You inserted money");
        gumballMachine.setState(gumballMachine.getHasMoneyState());
    }
 
    public void ejectMoney() {
        System.out.println("You haven't inserted any money");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no money");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for money";
    }
}
