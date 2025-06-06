package W6Quiz;

public class RunMethodOfThread extends Thread{
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.print(i++ + " "); // 1 3
		}
	}
	public static void main(String args[]) {
		RunMethodOfThread t1 = new RunMethodOfThread();
		t1.run();
	}
}
