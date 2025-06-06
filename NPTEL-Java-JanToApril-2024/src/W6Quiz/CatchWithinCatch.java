package W6Quiz;


public class CatchWithinCatch{
	public static void main(String[] args) {
		try {
			int a  = 5/ 0;
		} catch (Exception e) {
			//try {
				
			//}
			catch (ArithmeticException a) { // Syntax error on token "catch", invalid RecordHeaderName
			}
		}
		System.out.println ("Programming In Java"); //Programming In Java .... with try() catch(){} inside the catch(){}
	}
}
