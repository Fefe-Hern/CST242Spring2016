/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author hernf07
 */
public class EnemyShip {
    private String name;
    private double amtDamage;

    public EnemyShip() {
    }

    public EnemyShip(String name, double amtDamage) {
        this.name = name;
        this.amtDamage = amtDamage;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setDamage(double Damage) {
        this.amtDamage = Damage;
    }
    
    public void followHeroShip() {
        System.out.println(getName() + " is following the Hero!");

    }
    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }
    public void enemyShipShoots() {
        System.out.println(getName() + " fired its weapons! " + getDamage() + " damage inflicted.");
    }
    
}

