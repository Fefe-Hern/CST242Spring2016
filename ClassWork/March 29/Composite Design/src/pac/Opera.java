package pac;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Opera implements IPlayableItem{
    private String singer;
    private String title;

    public Opera(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }
    
    

    @Override
    public void play() {
        System.out.println("Playing " + singer + "'s " + title);
    }
    
}
