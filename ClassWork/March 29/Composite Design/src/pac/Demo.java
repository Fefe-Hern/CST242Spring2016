package pac;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Demo {

    public static void main(String[] args) {
        Song s1 = new Song("John", "Symph of the Night");
        Opera o1 = new Opera("Jane", "Lord of the Apes");
        PlayList list = new PlayList();
        list.add(s1);
        list.add(o1);
        list.play();
    }
}
