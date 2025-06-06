package W4Quiz;


interface calculate { // private, protected not accepted ... only public abstract accepted
	void cal (int item); // by default methods are public and abstract so you can't reduce visibility when implementing interface methods
}
class display implements calculate {
	int x;
	public void cal (int item) { // Always public is a must ... you can't reduce visibility from public to lower
		x = item * item;
	}
}
class interfaces { // public is not must here and is only optional ?
	public static void main(String args[]) {

	display arr = new display();// display constructor missing display() in Quiz Q-10 ... compile error
	arr.x = 0;
	arr.cal(2);
	System.out.println (arr.x);
	}
}
