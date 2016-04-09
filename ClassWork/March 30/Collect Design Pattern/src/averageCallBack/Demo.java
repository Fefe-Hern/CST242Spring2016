package averageCallBack;

import java.awt.Rectangle;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    public static void main(String[] args) {

        IMeasurer areaMes = new AreaMeasurer();
        Rectangle[] rects = new Rectangle[]{
            new Rectangle(5, 10, 20, 30),
            new Rectangle(10, 20, 20, 30),
            new Rectangle(15, 30, 20, 30),
            new Rectangle(25, 100, 20, 30)
        };
        double averageArea = Data.average(rects, areaMes);
        System.out.println("Average Area: " + averageArea);
        System.out.println("Expected: " + 600);
    }
}
