package W6Quiz;

public class ThreadActiveCount extends Thread{
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(Thread.activeCount());
	}
}
