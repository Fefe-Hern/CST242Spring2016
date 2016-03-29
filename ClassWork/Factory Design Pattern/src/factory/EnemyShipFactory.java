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
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        if(newShipType.equals("U")) {
            return new EnemyUFO();
        } else if (newShipType.equals("R")) {
            return new BossRocket();
        } else if (newShipType.equals("H")) {
            return new BossUFO();
        }
        else return null;
    }
}
