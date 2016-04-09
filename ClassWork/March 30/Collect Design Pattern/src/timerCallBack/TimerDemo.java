package timerCallBack;

import javax.swing.Timer;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class TimerDemo {
    public static void main(String[] args) {
        TimePrinter tp = new TimePrinter();
        Timer t = new Timer(1000, tp);
        t.start();
    }
}
