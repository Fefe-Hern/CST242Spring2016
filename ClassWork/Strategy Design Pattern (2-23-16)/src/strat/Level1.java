package strat;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Level1 implements Ability {
    public void travel() {
        System.out.println("I travel on foot.");
    }
    public void handleWeapon() {
        System.out.println("I fight with my fists.");
    }
    public void protect() {
        System.out.println("I wear a shirt and khakis.");
    }
}
