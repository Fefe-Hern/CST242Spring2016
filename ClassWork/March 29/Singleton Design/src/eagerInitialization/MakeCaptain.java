package eagerInitialization;
public class MakeCaptain {
    private static MakeCaptain captain = new MakeCaptain();
    private MakeCaptain() {
        
    }
    public static MakeCaptain getCaptain() {
        return captain;
    }
}
