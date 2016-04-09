package billPugh;

public class MakeACaptain { // outer class
	
//	private static MakeACaptain captain;
	//private constructor
	private MakeACaptain() {}
	
	private static class SingletonHelper { // inner class
		private static final MakeACaptain captain = new MakeACaptain();
	}
	
	public static MakeACaptain getCaptain() {
		return SingletonHelper.captain;
	}
}
