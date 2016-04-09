package lazyInitialization;

public class MakeACaptain {
	
	private static MakeACaptain captain;

	private MakeACaptain(){
	}
	
	public static synchronized MakeACaptain getCaptain() {
		if(captain == null) {
			captain = new MakeACaptain();
		} else {
			System.out.println("We already have a captain.");
		}
		return captain;
	}
}
