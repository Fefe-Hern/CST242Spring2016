package rocketSubjectObserver;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class RateObserver extends Observer {
    //private static double[] rates = new double[61];
    private static double[] rates = new double[11];
    
    public RateObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
    }
    @Override
    public void update() {
        double tPeak = subject.getState();
        for (int i = 0; i < rates.length; i++) {
            double n = -(i - tPeak);
            rates[i] = Math.pow(25, n);
        }
    }

    public static double getRates(int i) {
        return rates[i];
    }

    public double[] getRates() {
        return rates;
    }
    
    
    
}
