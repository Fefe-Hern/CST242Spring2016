package factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class ChocolateBoiler implements Runnable {

    private boolean empty;
    private boolean boiled;
    private int potLabel;

    public ChocolateBoiler(int potLabel) {
        empty = true;
        boiled = false;
        this.potLabel = potLabel;
    }
    
    
    @Override
    public void run() {
        fill();
        boil();
        drain();
    }
    
// To fill the boiler, it must be empty, and, once it is full, we set the empty and
//  boiled flags
    public void fill() {
        if(isEmpty()) {
            empty = false;
            System.out.println("Pot " + getPotLabel() + " has been filled with chocolate");
        } else {
            System.out.println("Pot " + getPotLabel() + " is already full of chocolate!");
        }
    }
    
// To boil the	mixture, the boiler has	to be full and not already boiled. Once	it is boiled,	
// we set the boiler flag to true.
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("Boiling pot " + getPotLabel() + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            boiled = true;
            System.out.println("Pot " + getPotLabel() + "'s chocolate has been boiled.");
        } else if(isEmpty()) {
            System.out.println("There is nothing to heat up in " + getPotLabel() + "!");
        } else if(isBoiled()) {
            System.out.println("The chocolate had already been boiled in " + getPotLabel() + "!");
        }
    }
    
// To drain the boiler, it must be full and also boiled. Once it is drained we set
// empty flag back to true
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
            boiled = false;
            System.out.println("Pot " + getPotLabel() + " had been drained of the boiled chocolate"
                    + " and is being sent for processing.");
        } else if(isEmpty()) {
            System.out.println("There is nothing in " + getPotLabel() + "!");
        } else if(!isBoiled()) {
            System.out.println("We cannot drain chunks of chocolate from " + getPotLabel() + "!");
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled() {
        return boiled;
    }

    public int getPotLabel() {
        return potLabel;
    }
}
