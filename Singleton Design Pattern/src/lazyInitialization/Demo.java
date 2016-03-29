package lazyInitialization;

public class Demo {

	public static void main(String[] args) {
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Try to make another captain");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if(c1== c2) {
			System.out.println("C1 and C2 are the same instance.");
		}
	}

}
