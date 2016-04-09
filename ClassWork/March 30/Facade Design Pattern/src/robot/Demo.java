package robot;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern Demo");
        RobotFacade rf1 = new RobotFacade();
        rf1.construct("Green", "Adamantium");
    }
}
