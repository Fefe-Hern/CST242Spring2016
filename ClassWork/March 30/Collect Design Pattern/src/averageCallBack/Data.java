package averageCallBack;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Data {
    public static double average(Object[] objects, IMeasurer meas) {
        double sum = 0;
        for (Object object : objects) {
            sum += meas.measure(object);
        }
        if(objects.length > 0) {
            return sum / objects.length;
        } else {
            return 0;
        }
    }
}
