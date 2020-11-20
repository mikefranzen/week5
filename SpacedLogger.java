package week5;

public class SpacedLogger implements Logger {
	//The SpacedLogger should add spaces between each character of the String argument passed into its methods.
	//If the log method received “Hello” as an argument, it should print H e l l o
	//The error method should do the same, but with “ERROR:” preceding the spaced out 
	//input (i.e. ERROR: H e l l o)

		public void Log(String logInput) {
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < logInput.length(); i++) {
				str.append(logInput.charAt(i));
				str.append(" ");
			}
			System.out.println(str.toString());
		}

		public void Error(String errorInput) {
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < errorInput.length(); i++) {
				str.append(errorInput.charAt(i));
				str.append(" ");
			}
			System.out.println("ERROR: " + str.toString());
			
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
