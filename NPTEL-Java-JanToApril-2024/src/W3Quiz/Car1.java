package W3Quiz;
class Vehicle1{
	
	public static void move() {
		System.out.println("Vehicle moves");
	}
}

public class Car1 extends Vehicle1{
	
	//@Override
	public static void move() { // treats as specialized method of Car class. 
		//Concept of static method hiding of parent class method. Static methods can't be overriden.
		
		System.out.println("Car moves");
	}

	public static void main(String[] args) {
		
		Vehicle1 vehicle1 = new Car1();
		vehicle1.move(); // Vehicle moves
		
		Vehicle1 vehicle2 = new Vehicle1();
		vehicle2.move(); // Vehicle moves
		
		Car1 car1 = new Car1();
		car1.move(); // Car moves
	}
}
