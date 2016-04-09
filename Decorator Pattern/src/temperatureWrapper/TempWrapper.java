package temperatureWrapper;

public class TempWrapper extends AbstractDecorator {

	public TempWrapper(ITemp temp) {
		super(temp);
	}
	
	public double letsConvertC2F(double temp) {
		return 30 * temp + 32;
	}

}
