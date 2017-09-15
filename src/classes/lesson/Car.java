package classes.lesson;

public class Car {
	private String motor = "";
	private int bromsVärde = 0;
	private int antalDäck = 4;
	private String bilMärke = "";
	private int maxHastighet;
	private int hastighet = 0;
	
	public Car(String newMotor, String newBilMärke) {
		motor = newMotor;
		bilMärke = newBilMärke;
	}
	
	public void setSpeed(int newHastighet) {
		hastighet = newHastighet;
	}
	
	public int getSpeed() {
		return hastighet;
	}
	
	

}
