/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob3;

import java.util.Scanner;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {
    public static void main(String[] args) {
        Context chosen = new Context();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the book price");
        double price = keyboard.nextDouble();
        keyboard.nextLine();
        
        IChoice ic;
        boolean flag = true;
        while(flag) {
            System.out.println("Enter your choice (1 for markup or 2 for markdown) by 10%");
            String choice = keyboard.nextLine();
            switch(choice) {
                case "1":   ic = new MyChoice1();
                            chosen.setChoice(ic);
                            price = chosen.dothings(price);
                            System.out.printf("New Price: $%.2f\n", price);
                            break;
                case "2":   ic = new MyChoice2();
                            chosen.setChoice(ic);
                            price = chosen.dothings(price);
                            System.out.printf("New Price: $%.2f\n", price);
                            break;
                default: 
                    System.out.println("No proper choice selected. Exiting");
                    flag = false;
                    break;
            }
        }
    }
}
