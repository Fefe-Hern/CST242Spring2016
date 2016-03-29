package captain;

/**
 *
 * @author hernf07
 */
public class Demo {
    public static void main(String[] args) {
        MakeCaptain c1 = MakeCaptain.getCaptain();
        System.out.println("Can we have another captain?");
        MakeCaptain c2 = MakeCaptain.getCaptain();
        if(c1 == c2) {
            System.out.println("The captain is the captain!");
        }
    }
}
