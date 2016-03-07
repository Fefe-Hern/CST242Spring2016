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
public abstract class Decorator {
    // Serves as a bridge
    private AComponent component;
    
    public void setComponent(AComponent component) {
        this.component = component;
    }
    public void doJob() {
        if(component != null) {
            component.doJob();
        }
    }
}
