package threadPool7;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {
    public static void main(String[] args) {
        //Processor t1 = new Processor(1); t1.run();
        Thread t1 = new Thread(new Processor(1));
        t1.start();
    }
}
