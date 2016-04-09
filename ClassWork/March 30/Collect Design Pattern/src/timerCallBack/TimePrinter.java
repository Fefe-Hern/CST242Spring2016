package timerCallBack;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is: " + now.toString());
        Toolkit.getDefaultToolkit().beep();
    }
    
    
}
