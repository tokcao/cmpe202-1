/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends Widget
{

	private String date = "" ;

	public String display() {
		if ( date.equals("") )
			return "[MMYY]";
		else
			return "[" + date + "]";
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
			date += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

}