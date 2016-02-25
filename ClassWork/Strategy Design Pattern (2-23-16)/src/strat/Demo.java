package strat;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero = new Hero("Link");
        hero.setAbility(new Level2());
        hero.handleWeapon();
        hero.travel();
        hero.protect();
        // TODO code application logic here
    }
    
}
