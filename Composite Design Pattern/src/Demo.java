
public class Demo {

	public static void main(String[] args) {
		Song s1 = new Song("John", "Whatever Song");
		Opera o1 = new Opera("Jane", "Whatever Opera");
		PlayList list = new PlayList();
		list.add(s1);
		list.add(o1);
		list.play();
	}
}
