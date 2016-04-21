package threadPool7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Processor implements Runnable {
    private int id;

    public Processor(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Starting: " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Complete");
    }
    
}
