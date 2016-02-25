package temperatureWrapper;

public class AbstractDecorator implements ITemp{

	private ITemp ic;
	
	public AbstractDecorator(ITemp temp) {
		ic = temp;
	}
	
	@Override
	public double letsConvertF2C(double t) {
		return ic.letsConvertF2C(t);
	}

}
