package week5;

import week5.AsteriskLogger;
import week5.SpacedLogger;


public class app {

	public static void main(String[] args) {
		// Create a class named App that has a main method.
		// In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		// Test both methods on both instances, passing in Strings of your choice.
		
		AsteriskLogger Alogger = new AsteriskLogger();
		SpacedLogger Slogger = new SpacedLogger();
		
		Alogger.Log("Alogger Log");
		Alogger.Error("Alogger Error");
		Slogger.Log("Slogger Log");
		Slogger.Error("Slogger Error");		
	}

}
