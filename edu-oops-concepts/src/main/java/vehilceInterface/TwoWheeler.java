package vehilceInterface;

public abstract class TwoWheeler implements LandVehicle {
	private final int wheels=2;
	@Override
	public void steer() {
		// TODO Auto-generated method stub
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub

	}
	
	public int getWheels()
	{
		return wheels;
	}

}
