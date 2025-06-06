package W6Quiz;

class MissingCodeInMain extends Thread{
	public static void main(String args[]) {
		
		MissingCodeInMain run = new MissingCodeInMain();
		Thread t = new Thread(run);
		t.start();;
}
	public void run() {
		
		System.out.println("Running"); // Running
	}
}