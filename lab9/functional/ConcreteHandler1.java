public class ConcreteHandler1 implements Handler {

    private Handler successor = null;

	public void handleRequest( String request, Operation operation ) {
        System.out.println( "R1 got the request...");
        if ( request.equalsIgnoreCase("R1") )
        {
            operation.operation(this.getClass().getName());
//            System.out.println( this.getClass().getName() + " => This one is mine!");
        }
        else
        {
            if ( successor != null )
                successor.handleRequest(request, operation);
        }

	}

	public void setSuccessor(Handler next) {
        this.successor = next ;
	}

}
