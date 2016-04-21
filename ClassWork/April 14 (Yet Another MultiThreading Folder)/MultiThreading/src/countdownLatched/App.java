package countdownLatched;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class App {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        for (int i = 1; i <= 3; i++) {
            executor.submit(new Processor(latch));
        }
        
        try { 
            latch.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Done");
        
        // shut down or it will hang forever.
    }
}
