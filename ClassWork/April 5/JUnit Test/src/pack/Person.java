package pack;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Person {
    private String name;
    private int id = 0;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public Person(Person person) {
        this.name = person.getName();
        this.id = person.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
