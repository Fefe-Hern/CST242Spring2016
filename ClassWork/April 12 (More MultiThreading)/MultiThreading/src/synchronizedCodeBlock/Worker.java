package synchronizedCodeBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Worker {
    private Random random = new Random();
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    
    public void stageOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("Error");
            }
            list1.add(random.nextInt(100));
        }
    }
    public void stageTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("Error");
            }
            list2.add(random.nextInt(100));
        }
    }
    
    public void process() {
        for (int i = 0; i < 10000; i++) {
            stageOne();
            stageTwo();
        }
    }
    
    public void main() {
        System.out.println("Starting...");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
            
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
            
        });
        
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken: " + (end - start));
        System.out.println("List 1: " + list1.size() + "\tList2: " + list2.size());
    }
}
