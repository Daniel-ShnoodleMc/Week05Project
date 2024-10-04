package loggerProject;

public class App {

	public static void main(String[] args) {
		String theTest = "Libby";
		String theNext = "Kiki";
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log(theTest);
		asteriskLogger.error(theTest);
		spacedLogger.log(theNext);
		spacedLogger.error(theNext);
	}
}
