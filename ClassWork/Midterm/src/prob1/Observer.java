package prob1;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public abstract class Observer {
    protected Observable subject;
    public abstract void update();
}
