/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends Widget
{

	private String number = "" ;

	public String display() {
		if ( number.equals("") )
			return "[4444444444444444]";
		else
			return "[" + number + "]";
	}	

	public void key(String ch, int cnt) {
		if (ch.equals("X") && cnt < 16) {
			number = number.substring(0, number.length() - 1);
		} else if (!ch.equals("X") && cnt <= 16 ){
			number += ch ;
		} else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

}