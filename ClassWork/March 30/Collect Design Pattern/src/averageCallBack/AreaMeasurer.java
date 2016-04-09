package averageCallBack;

import java.awt.Rectangle;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class AreaMeasurer implements IMeasurer {

    @Override
    public double measure(Object anObject) {
        Rectangle aRectangle = (Rectangle) anObject;
        double area = aRectangle.getWidth() * aRectangle.getHeight();

        return area;
    }
    
}
