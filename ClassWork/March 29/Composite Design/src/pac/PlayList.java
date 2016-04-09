package pac;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<IPlayableItem> list;
    
    public PlayList() {
        list = new ArrayList<>();
    }
    
    public void add(IPlayableItem item) {
        list.add(item);
    }
    
    public void play() {
        for (IPlayableItem i : list) {
            i.play();
        }
    }
}
