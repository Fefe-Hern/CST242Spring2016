package threadPool7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executor.submit(new Processor(i));
        }
        executor.shutdown();
        System.out.println("All tasks submitted.");
        
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException ex) {
        }
        System.out.println("All tasks completed.");
    }
    
}
