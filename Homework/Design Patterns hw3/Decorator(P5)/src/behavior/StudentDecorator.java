package behavior;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class StudentDecorator implements HomeWork{

    protected Student decoratedStudent;

    public StudentDecorator(Student decoratedStudent) {
        this.decoratedStudent = decoratedStudent;
    }
    
    
    @Override
    public void doHomework() {
        decoratedStudent.doHomework();
    }
    
}
