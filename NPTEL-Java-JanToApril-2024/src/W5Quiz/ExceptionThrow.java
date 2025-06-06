package W5Quiz;

class Test extends Exception {}

class ExceptionThrow { // optional: public
	public static void main(String args[]) { // optional: throws Exception {
		try {
			throw new Test();
		} catch (Test t) {
			System.out.println("Got the Test Exception");
			return; // finally dominates return statement and finally block is executed as usual
		} finally {
			System.out.println("inside finally block ");
		}
	}
}

/*
Got the Test Exception
inside finally block 
*/
