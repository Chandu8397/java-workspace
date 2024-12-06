package exceptions.demo;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :4:35:44 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

//Define Custom Exception Class to Handle Insufficient funds in a Bank
public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
		super(message);
	}
	

}
