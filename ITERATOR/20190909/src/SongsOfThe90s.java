import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

	Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
	
	int hashKey = 0;
	
	
	
	public SongsOfThe90s() {
	
		// TODO Auto-generated constructor stub
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
	
	}


	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs.put(hashKey, songInfo);
	}
	public Hashtable<Integer, SongInfo> getBestSongs(){
		return bestSongs;
	}
	@Override
	public Iterator<SongInfo> createInterator() {
		// TODO Auto-generated method stub
		return bestSongs.values().iterator();
	}

}
