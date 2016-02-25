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
public class Context {
    private IChoice myRealChoice;
    
    public Context() {}
    
    public void setChoice(IChoice ic) {
        myRealChoice = ic;
    }
    
    public void dothings(String str1, String str2) {
        myRealChoice.myChoice(str1, str2);
    }
}
