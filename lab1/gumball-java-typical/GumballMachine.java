import java.util.HashSet;

public class GumballMachine
{

    private int num_gumballs;
    private int cost_gumball;
    private int coins_inserted;
    private HashSet accepted_coin_types;
    private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    /**
     * New Constructor for to support instantiating all thee types of gumball machines.
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
        this.accepted_coin_types = HashSet(accepted_coin_types);
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }

    /**
     * Add the inserted coin value to the coins_serted, if the coin is acceptable.
     * @param coin
     * The value of the inserted coin.
     */
    public void insertCoins(int coin){
        coins_inserted += accepted_coin_types.contains(coin) ? coin : 0;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
