package countdownLatched;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Processor implements Runnable {
    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }
    
    @Override
    public void run() {
        System.out.println("Started");
        try{
            Thread.sleep(2000);
        } catch(Exception e) {
            
        }
        System.out.println("Completed");
        latch.countDown();
    }
    
}
