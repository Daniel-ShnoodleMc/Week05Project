package loggerProject;

public class AsteriskLogger {

	public void log(String theTest) {
		System.out.println("***" + theTest + "***");
	}
	
	String errorBoxyBox = "******************";
	public void error(String theTest) {
		System.out.println(errorBoxyBox);
		System.out.println("***ERROR:" + theTest + "***");
		System.out.println(errorBoxyBox);
	}
}
