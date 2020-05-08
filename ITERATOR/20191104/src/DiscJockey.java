import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {
	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	public DiscJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
		super();
		this.iter70sSongs = iter70sSongs;
		this.iter80sSongs = iter80sSongs;
		this.iter90sSongs = iter90sSongs;
	}
	
	public void showTheSongs() {
		ArrayList<?> aL70sSongs = songs70s.getBestSongs();
		
		System.out.println("Songs of the 70s");
		
		for(int i = 0; i < aL70sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		SongInfo[] array80sSongs = songs80s.getBestSongs();
		System.out.println("Songs of the 80s");
		
		for(int j = 0; j < array80sSongs.length; j++) {
			SongInfo bestSongs = array80sSongs[j];
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();){
		
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
		}
			
	}
	public void showTheSongs2() {
		System.out.println("New Way With Interator");
		
		Iterator<?> Songs70s = iter70sSongs.createIterator();
		Iterator<?> Songs80s = iter80sSongs.createIterator();
		Iterator<?> Songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s");
		printTheSongs(Songs70s);
		
		System.out.println("Songs of the 80s");
		printTheSongs(Songs80s);
		
		System.out.println("Songs of the 90s");
		printTheSongs(Songs90s);
	}
	public void printTheSongs(Iterator<?> interator) {
		while(interator.hasNext()) {
			SongInfo sognInfo  =(SongInfo) interator.next();
			System.out.println(sognInfo.getSongName());
			System.out.println(sognInfo.getBandName());
			System.out.println(sognInfo.getYearReleased() + "\n");
			
		}
	}
}
