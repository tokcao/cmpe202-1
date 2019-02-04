import java.util.Arrays;
import java.util.HashSet;

public class GumballMachine
{

    private int num_gumballs;
    private int cost_gumball;
    private int coins_inserted;
    private HashSet<Integer> accepted_coin_types;

    /**
     * New Constructor for to support instantiating all three types of gumball machines.
     * @param size
     * Specified how many gumballs are available in the gumball machine
     * @param cost_gumball
     * Cost of each gumball
     * @param accepted_coin_types
     * An array of accepted coins types (i.e. nickles, dimes, etc.)
     */
    public GumballMachine(int size, int cost_gumball, int[]accepted_coin_types){
        this.coins_inserted = 0;
        this.num_gumballs = size;
        this.cost_gumball = cost_gumball;
        this.accepted_coin_types = new HashSet();
        for(int coin_type : accepted_coin_types){
            this.accepted_coin_types.add((Integer) coin_type);
        }
    }

    /**
     * Add the inserted coin value to the coins_serted, if the coin is acceptable.
     * @param coin
     * The value of the inserted coin.
     */
    public void insertCoins(int coin){
        if (this.accepted_coin_types.contains(coin)) {
            this.coins_inserted += coin;
            System.out.println("Coin added. Total coins inserted: " + this.coins_inserted);
        } else {
            System.out.println("The coin inserted is not acceptable.");
        }
    }
    
    public void turnCrank()
    {
    	if ( this.coins_inserted >= this.cost_gumball )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.coins_inserted -= this.cost_gumball ;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert coins." ) ;
    	}        
    }
}
