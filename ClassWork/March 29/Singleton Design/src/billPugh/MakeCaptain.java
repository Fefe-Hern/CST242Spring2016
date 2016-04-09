package billPugh;
public class MakeCaptain {
    private static MakeCaptain captain;

    private MakeCaptain() {
    }
    
    private static class SingletonHelper {
        private static final MakeCaptain captain = new MakeCaptain();
    }
    public static MakeCaptain getCaptain() {
        return SingletonHelper.captain;
    }
    
}
