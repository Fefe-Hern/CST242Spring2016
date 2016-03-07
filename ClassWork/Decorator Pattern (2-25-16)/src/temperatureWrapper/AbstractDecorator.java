package temperatureWrapper;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class AbstractDecorator implements ITemp {

    private ITemp ic;
    
    public AbstractDecorator(ITemp temp) {
        ic = temp;
    }
    @Override
    public double convertFtoC(double t) {
        return ic.convertFtoC(t);
    }
    
}
