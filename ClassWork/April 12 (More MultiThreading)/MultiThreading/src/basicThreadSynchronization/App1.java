package basicThreadSynchronization;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
class Processor extends Thread {
    private volatile boolean flag = true; //Check back more often
    
    public void run() {
        while(flag) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
    }
    
    public void shutdown() {
        flag = false;
    }
}

public class App1 {
    public static void main(String[] args) {
        Processor p1 = new Processor();
        p1.start();
        System.out.println("Press return to pause: ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        p1.shutdown();
    }
}
