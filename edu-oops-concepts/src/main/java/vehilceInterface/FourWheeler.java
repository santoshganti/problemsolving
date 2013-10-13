package vehilceInterface;

public abstract class FourWheeler implements LandVehicle {
	private int engineStrokes;
	public FourWheeler() {
		this(4);
	}
	public FourWheeler(int engineStrokes){
		this.engineStrokes= engineStrokes;
		System.out.println("Four Wheeler Created with Engine Strokes"+engineStrokes);
	}
	@Override
	public void accelerate() {
		System.out.println("Four Wheeler:I am going at full speed");

	}

	@Override
	public void decelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void steer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub

	}

}
