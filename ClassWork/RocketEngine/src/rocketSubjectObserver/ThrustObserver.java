package rocketSubjectObserver;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class ThrustObserver extends Observer {
    //private double[] thrusts = new double[61];
    private double[] thrusts = new double[11];

    public ThrustObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this);
    }

    
    @Override
    public void update() {
        double tPeak = subject.getState();
        for (int i = 0; i < thrusts.length; i++) {
            double rate = RateObserver.getRates(i);
            thrusts[i] = Math.pow(rate / 0.6, 1/0.3) * 1.7;
        }
    }

    public double[] getThrusts() {
        return thrusts;
    }
    
    public double getThrusts(int i) {
        return thrusts[i];
    }
    
}
