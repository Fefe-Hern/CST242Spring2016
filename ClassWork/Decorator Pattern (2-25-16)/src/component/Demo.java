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
public class Demo {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        cc.doJob();
        System.out.println("__________________________");
        
        ConcreteDecorator ex1 = new ConcreteDecorator();
        ex1.setComponent(cc);
        ex1.doJob();
        ConcreteDecoratorEX2 ex2 = new ConcreteDecoratorEX2();
        ex2.setComponent(cc);
        ex2.doJob();
    }
}
