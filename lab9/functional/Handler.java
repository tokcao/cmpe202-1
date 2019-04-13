public interface Handler {

	interface Operation {
		void operation(String req);
	}

	void handleRequest( String request, Operation operation );
	void setSuccessor(Handler next);

}
