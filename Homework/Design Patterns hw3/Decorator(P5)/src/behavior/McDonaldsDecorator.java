package behavior;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class McDonaldsDecorator extends StudentDecorator{
    
    public McDonaldsDecorator(Student decoratedStudent) {
        super(decoratedStudent);
    }
    
    @Override
    public void doHomework() {
        decoratedStudent.doHomework();
        workatMcD();
    }

    private void workatMcD() {
        System.out.println("I also work at McDonalds.");
    }
    
}
