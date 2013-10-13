package vehicleInterface;

import org.junit.Test;

import vehilceInterface.Bicycle;
import vehilceInterface.Car;
import vehilceInterface.CarAutomaticTransmission;
import vehilceInterface.CarManualTransmission;
import vehilceInterface.FourWheeler;
import vehilceInterface.Vehicle;

public class VehicleTest {
	@Test
	public void testVehicles() {
//		Vehicle vehicle;
//		vehicle = new Bicycle();
//		vehicle.accelerate();
//		vehicle = new Car();
//		vehicle.accelerate();
		Car car1 = new Car();
		car1 = new CarAutomaticTransmission();
		car1 = new CarManualTransmission();
		car1.accelerate();
		
		Car car2 = new Car(6);
	}
}
