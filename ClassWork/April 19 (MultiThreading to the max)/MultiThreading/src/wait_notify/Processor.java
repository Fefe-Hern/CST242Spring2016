package wait_notify;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Processor {
    private Object lock = new Object();
    
    public void produce() throws InterruptedException {
        synchronized(lock) { //Synchronized Code Block
            System.out.println("Producer Thread Running...");
            wait();
            System.out.println("Resumed.");
        }
    }
    
    public void consume() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
            synchronized (this) {
                System.out.print("Waiting for return key: ");
                scanner.nextLine();
                System.out.println("Return key is pressed.");
                notify();
                Thread.sleep(5000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
