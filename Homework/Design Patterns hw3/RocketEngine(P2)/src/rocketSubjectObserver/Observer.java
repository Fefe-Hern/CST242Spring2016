package rocketSubjectObserver;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
