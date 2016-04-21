package wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Each object in Java has an intrinsic lock built-in.
 *
 *
 *
 *
*/

/**
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class App {
    public static void main(String[] args) {
        final Processor processor = new Processor();
        Thread t1 = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Thread t2 = new Thread(() -> {
            processor.consume();
        });
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
