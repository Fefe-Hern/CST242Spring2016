/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author hernf07
 */
public class Demo {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.println("What ship comes? [U, R, H]");
            if(userInput.hasNextLine()) {
                String typeOfShip = userInput.nextLine();
                theEnemy = shipFactory.makeEnemyShip(typeOfShip);
                if(theEnemy != null) {
                    doStuffEnemy(theEnemy);
                } else {
                    System.out.println("Please enter U, R, or H.");
                }
            }
        }
    }

    private static void doStuffEnemy(EnemyShip theEnemy) {
        theEnemy.followHeroShip();
        theEnemy.displayEnemyShip();
        theEnemy.enemyShipShoots();
    }
}
