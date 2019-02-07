import java.util.HashSet;

public class GumballMachine {
 
    State soldOutState;
    State noMoneyState;
    State hasMoneyState;
    State soldState;
 
    State state = soldOutState;
    int count;
    int cost;
    int money_inserted = 0;
    HashSet<Integer> accepted_coin_types;
 
    public GumballMachine(int numberGumballs, int cost_gumball, int[] accepted_coin_types) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState= new HasMoneyState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noMoneyState;
        } 
        this.cost = cost_gumball;
        this.accepted_coin_types = new HashSet<Integer>();
        for(int coin_type : accepted_coin_types){
            this.accepted_coin_types.add((Integer) coin_type);
        }
    }
 
    public void insertMoney(int money) {
        if (this.accepted_coin_types.contains(money) && !hasEnoughMoney()) {
            this.money_inserted += money;
            state.insertMoney();
            System.out.println("Money added. Total money inserted: " + this.money_inserted);
        } else if (hasEnoughMoney()) {
            System.out.println("You have inserted enough money");
        } else {
            System.out.println("The money inserted is not acceptable.");
        }
    }
 
    public void ejectMoney() {
        state.ejectMoney();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        this.money_inserted = 0;
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    void releaseMoney() {
        this.money_inserted = 0;
    }
    
    int getCount() {
        return count;
    }
    
    boolean hasEnoughMoney(){
        return this.money_inserted >= cost;
    }
 
    void refill(int count) {
        this.count = count;
        state = noMoneyState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
