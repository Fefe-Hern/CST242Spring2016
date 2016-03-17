/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob3;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class MyChoice1 implements IChoice {

    @Override
    public double myChoice(double price) {
        return price * 1.1;
    }
    
}
