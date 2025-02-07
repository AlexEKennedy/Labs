package lab18;

public class Racingcar extends Car {
	private String driver;
	private double turboFactor;
	public Racingcar(String model, int speed, String driver, double turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	public void accelerate(Car car, int seconds) {
		super.accelerate(seconds);
		this.speed *= turboFactor;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public double getTurboFactor() {
		return turboFactor;
	}
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
}
