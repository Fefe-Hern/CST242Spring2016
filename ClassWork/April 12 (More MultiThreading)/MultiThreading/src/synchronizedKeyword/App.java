package synchronizedKeyword;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class App {
    
    private int count = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }
    
    public void doWork() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join(); // Joins threads together and wait until they finish.
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(count);
    }

    private synchronized void increment() {
        count++;
    }
    
}
