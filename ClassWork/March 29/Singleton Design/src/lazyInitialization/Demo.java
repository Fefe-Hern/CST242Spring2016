package lazyInitialization;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {
    public static void main(String[] args) {
        MakeCaptain c1 = MakeCaptain.getCaptain();
        System.out.println("Make another");
        MakeCaptain c2 = MakeCaptain.getCaptain();
        
        if (c1 == c2) {
            System.out.println("c1 and c2 are the same object.");
        }
        
    }
}
