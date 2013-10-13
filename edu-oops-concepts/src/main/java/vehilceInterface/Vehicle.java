package vehilceInterface;

/**
 * we will write an interface to understand indepth about interfaces.
 * 
 * @author santoshganti
 * 
 */
public interface Vehicle {
	/**
	 * we have behavior of a vehicle in general.
	 */
	// A vehicle can accelerate
	public void accelerate();

	// A vehicle can decelerate
	public void decelerate();

	// A vehicle can be steered
	public void steer();

	// A vehicle can be stopped by applying brakes
	public void brake();
}
