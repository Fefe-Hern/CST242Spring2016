/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captain;
public class MakeCaptain {
    private static MakeCaptain _captain;

    private MakeCaptain() {
    }
    
    public static MakeCaptain getCaptain() {
        if(_captain == null) {
            _captain = new MakeCaptain();
        } else {
            System.out.println("Our captain exists!");
        }
        return _captain;
    }
}
