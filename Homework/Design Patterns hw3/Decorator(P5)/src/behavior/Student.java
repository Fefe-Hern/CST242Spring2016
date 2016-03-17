package behavior;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Student implements HomeWork {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    
    @Override
    public void doHomework() {
        System.out.println("I am " + name + " and I'm doing my CS homework.");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
