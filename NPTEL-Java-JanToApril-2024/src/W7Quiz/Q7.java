package W7Quiz;

import java.io.*;

class Q7 {
	public static void main(String[] args) {
		
		String obj = "abcdefghijh";
		int length = obj.length();
		char c[] = new char[length];
		obj.getChars(0, length, c, 0);
		
		CharArrayReader input1 = new CharArrayReader(c);
		CharArrayReader input2 = new CharArrayReader(c, 1, 4);
		
		int i, j;
		
		try {
			while ((i = input1.read()) == (j = input2.read())) {
				
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
