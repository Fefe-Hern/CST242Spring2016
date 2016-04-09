package robot;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class RobotFacade {
    private RobotColor c;
    private RobotMetal m;
    private RobotBody b;
    
    public RobotFacade() {
        c = new RobotColor();
        m = new RobotMetal();
        b = new RobotBody();
    }
    public void construct(String color, String metal) {
        System.out.println("Starting Creation of Robot...");
        c.setColor(color);
        m.setMetal(metal);
        b.createBody();
        System.out.println("Robot created.");
    }
}
