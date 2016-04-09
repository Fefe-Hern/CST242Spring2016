package pack;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class BodyBag {
    
    private Person[] personArray;
    private int count;

    public BodyBag(int maxSize) {
        personArray = new Person[maxSize];
        count = 0;
    }
    
    public void add(Person person) {
        personArray[count++] = new Person(person);
    }
    
    public Person findById(int id) {
        int i = 0;
        for (i = 0; i < count; i++) {
            if(personArray[i].getId() == id) {
                break;
            }
        }
        if(i == count) {
            return null;
        } else {
            return personArray[i];
        }
    }
    
    public Person removeById(int id) {
        int i = 0;
        for (i = 0; i < count; i++) {
            if(personArray[i].getId() == id) {
                break;
            }
        }
        if(i == count) {
            return null;
        } else {
            Person person = personArray[i];
            for (int j = i; j < count; j++) {
                personArray[j] = personArray[j+1];
            }
            count--;
            return person;
        }
    }
    
}
