package factory;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ChocolateBoiler(1));
        Thread thread2 = new Thread(new ChocolateBoiler(2));
        Thread thread3 = new Thread(new ChocolateBoiler(3));
        Thread thread4 = new Thread(new ChocolateBoiler(4));
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
    
}
