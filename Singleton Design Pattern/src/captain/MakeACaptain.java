package captain;

public class MakeACaptain {
	private static MakeACaptain _captain;
	
	private MakeACaptain()
	{
	};
	// lazy initialization
	public static MakeACaptain getCaptain() {
		if(_captain == null) {
			_captain = new MakeACaptain();
			System.out.println("A new captain is selected.");
		} else {
			System.out.println("We already have a captain.");
		}
		return _captain;
	}
}
