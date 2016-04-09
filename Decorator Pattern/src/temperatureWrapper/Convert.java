package temperatureWrapper;

public class Convert implements ITemp {
	public double letsConvertF2C(double t) {
		return (t - 32) * 0.5556;
	}
}
