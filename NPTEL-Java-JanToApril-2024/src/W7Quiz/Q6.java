package W7Quiz;

import java.io.*;

class Q6 {
	public static void main(String args[]) throws FileNotFoundException,
		IOException {
	InputStream obj = new FileInputStream("inputoutput.java");
	System.out.print(obj.available());
	obj.close();
	}
}

