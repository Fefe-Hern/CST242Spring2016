package gui_Example;

import java.util.EventObject;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
class OKButtonEventObject extends EventObject {
    private String name;
    private String id;
    
    public OKButtonEventObject(Object source) {
        super(source);
    }

    public OKButtonEventObject(String name, String id, Object source) {
        super(source);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    
    
}
