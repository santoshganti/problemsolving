package vehilceInterface;

public class Car extends FourWheeler {
	public Car() {
		System.out.println("Car created");
	}

	public Car(int engineStrokes) {
		super(engineStrokes);
		System.out.println("Car created with engine strokes="+engineStrokes);
	}
}
