/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choices;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class MyChoice1 implements IChoice {

    @Override
    public void myChoice(String str1, String str2) {
        System.out.println("I am doing things based on myChoice1: " + 
                str1 + str2);
    }
    
}
