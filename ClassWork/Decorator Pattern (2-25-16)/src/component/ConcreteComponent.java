/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class ConcreteComponent extends AComponent{
    @Override
    public void doJob() {
        System.out.println("Concrete Component: closed for change");
        
    }
}
