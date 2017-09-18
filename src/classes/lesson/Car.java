package classes.lesson;

public class Car {
	// Bilens motor typ
	private String motor = "";
	private int brakingValue = 0;
	private int numburOfWheels = 4;
	private String brand = "";
	private int maxSpeed;
	private int speed = 0;

	public Car(String newMotor, String newCarBrand) {
		motor = newMotor;
		brand = newCarBrand;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

}
