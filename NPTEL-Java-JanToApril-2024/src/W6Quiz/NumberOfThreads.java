package W6Quiz;

class NumberOfThreads extends Thread {
	public void run() {
		System.out.println ("\nThread is running now\n"); // Thread is running now

}
	public static void main(String[] args) {
		NumberOfThreads threadE = new NumberOfThreads();
		threadE. start ();
		
		System.out.println("Number of active threads = " + Thread.activeCount());// Number of active threads = 2
	}
}
