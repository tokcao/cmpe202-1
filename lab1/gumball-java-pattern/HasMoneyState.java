

import java.util.Random;

public class HasMoneyState implements State {
    GumballMachine gumballMachine;
 
    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertMoney() {
        System.out.println("You inserted money");
    }
 
    public void ejectMoney() {
        System.out.println("Money returned");
        gumballMachine.releaseMoney();
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(gumballMachine.hasEnoughMoney()){
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            System.out.println("Not enough money");
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
