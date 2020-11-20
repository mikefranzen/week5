package week5;

public class AsteriskLogger implements Logger {
	// Create two classes that implement the Logger interface
	// AsteriskLogger
	// SpacedLogger
	// The log method on the AsteriskLogger should print out the String it receives 
	// between 3 asterisks on either side of the String (e.g. if the String passed in is 
	// “Hello”, then it should print ***Hello*** to the console.
	// The error method on the AsteriskLogger should print the String it receives inside 
	// a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
	//
	// ****************
	// ***Error: Hello***
	// ****************

public void Log(String logInput) {
	System.out.println("***" + logInput + "***");
}

public void Error(String errorInput) {
	
	System.out.println("****************");
	System.out.println("***" + errorInput + "***");
	System.out.println("****************");
}


public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

