package prob1;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class IntObserverDoubled extends Observer {
    private int num;

    public IntObserverDoubled(Observable subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    
    @Override
    public void update() {
        num = subject.getState();
        System.out.println("The number doubled is: " + (num * 2));
    }
    
}
