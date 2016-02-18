package p1;

import java.util.EventObject;

public class WindowEvent extends EventObject {

    private Student student;
    
    public WindowEvent(Object source) {
        super(source);
    }
    
    public WindowEvent(Object source, Student student) {
        super(source);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    
}
