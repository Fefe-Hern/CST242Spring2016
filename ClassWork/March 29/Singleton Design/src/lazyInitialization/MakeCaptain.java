package lazyInitialization;
public class MakeCaptain {

    private static MakeCaptain captain;
    
    private MakeCaptain() {
    }
    
    public static synchronized MakeCaptain getCaptain() {
        // synchronized makes thread safe but slower
        if (captain == null) {
            captain = new MakeCaptain();
        } else {
            System.out.println("We have a captain.");
        }
        return captain;
    }
}
