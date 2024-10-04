package loggerProject;

public class SpacedLogger {

	public void log(String theNext) {
		System.out.println(galaxy2(theNext));
	}
	public void error(String theNext) {
		System.out.println("ERROR: " + galaxy2(theNext));
	}
	
	public String galaxy2(String theNext) {
		StringBuilder strBu = new StringBuilder();
		
		for (int i=0; i < theNext.length(); i++) {
			strBu.append(theNext.charAt(i));
			strBu.append(" ");
		}
		theNext = strBu.toString();
		
		return theNext;
	}
}
