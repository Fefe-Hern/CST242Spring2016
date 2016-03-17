package behavior;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeWork student = new Student("Fernando");
        student.doHomework();
        
        student = new StudentDecorator(new Student("James"));
        student.doHomework();
        
        student = new McDonaldsDecorator(new Student("Alex"));
        student.doHomework();
        // TODO code application logic here
    }
    
}
