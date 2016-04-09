
public class Song implements IPlayableItem{

	private String artist;
	private String title;
	
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Playing " + artist + "'s " + title);
	}
	
	
}
