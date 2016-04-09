package eagerInitialization;

public class MakeACaptain {
	private static MakeACaptain captain = new MakeACaptain();
	
	private MakeACaptain() {}
	
	public static MakeACaptain getCaptain() {
		return captain;
	}
}
