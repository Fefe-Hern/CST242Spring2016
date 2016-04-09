/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choice;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Context {
    private IChoice myRealChoice;
    /**
     * Constructor will provide a certain choice for a case method. Choice set by Option Dialog
     */
    public Context() {}
    
    /**
     *
     * @param ic
     * @return
     */
    public int setChoice(IChoice ic) {
        myRealChoice = ic;
        return dothings();
    }
    
    /**
     * 
     * @return
     */
    public int dothings() {
        return myRealChoice.myChoice();
    }
}
