package temperatureWrapper;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Convert implements ITemp {
    @Override
    public double convertFtoC(double t) {
        return((t - 32) / (9.0/5.0));
    }
}
