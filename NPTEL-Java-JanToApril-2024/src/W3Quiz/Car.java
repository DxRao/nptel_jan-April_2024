package W3Quiz;
class Vehicle{
	
	int i;
	String k = "Parent";
	
	public void move() {
		System.out.println("Vehicle moves");
		System.out.println(i);
	}
}

public class Car extends Vehicle{
	String k = "Child";
	int j;
	
	//@Override
	public void move() {
		System.out.println("Car ... moves");
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		
		Car car = new Car(); // method overriding
		car.i = 1;
		car.j = 2;
		car.move(); // Car moves 1 2
		
		Vehicle vehicle = new Car(); // method overriding
		vehicle.i = 3;
		
		//vehicle.j = 4; // Can't access child's properties in child's class
		
		vehicle.move(); // Car moves 3 0		
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.i = 5;
		//vehicle1.j = 6; // Can't child's properties both with parent obj and with parent ref variable
		
		vehicle1.move(); // Vehicle moves 5
		
		Vehicle v = new Car();
		System.out.println("Parent's k value " + v.k); // Parent // Accesses parents i with original value
		System.out.println("Child's's k value " + car.k); // Child

	}

}
/*
1
2
Car moves
3
0
Vehicle moves
5
*/
