package prob1;

import java.util.Scanner;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observable design = new Observable();
        new IntObserver(design);
        new IntObserverDoubled(design);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numInput = input.nextInt();
        design.setState(numInput);
    }
    
}
