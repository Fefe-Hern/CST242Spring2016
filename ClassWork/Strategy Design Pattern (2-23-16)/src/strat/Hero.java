package strat;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Hero {
    private String name;
    private Ability ability;
    public Hero(String name) {
        this.name = name;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
    
    public void travel() {
        ability.travel();
    }
    public void handleWeapon() {
        ability.handleWeapon();
    }
    public void protect() {
        ability.protect();
    }
}
