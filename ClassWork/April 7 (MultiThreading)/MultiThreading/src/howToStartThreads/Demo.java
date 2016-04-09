package howToStartThreads;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {
    public static void main(String[] args) {
        Runner run = new Runner();
        Runner run2 = new Runner();
        run.start();
        run2.start();
    }
}
