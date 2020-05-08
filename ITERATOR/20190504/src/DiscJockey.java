import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70s;
	SongIterator iter80s;
	SongIterator iter90s;
	
//	 public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {
//		          
//		         songs70s = newSongs70s;
//		         songs80s = newSongs80s;
//		         songs90s = newSongs90s;
//		     }
	
	public DiscJockey(SongIterator iter70s, SongIterator iter80s, SongIterator iter90s) {
		super();
		this.iter70s = iter70s;
		this.iter80s = iter80s;
		this.iter90s = iter90s;
	}
	
	public void showtheSongs() {
		ArrayList aL70sSongs = songs70s.getBestSongs();
		System.out.println("Songs of the 70s\n");
		
		for(int i=0; i<aL70sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo)aL70sSongs.get(i);
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		SongInfo[] array80sSongs = songs80s.getBestSongs();
		System.out.println("Songs of the 80s\n");
		for(int j=0; j<array80sSongs.length; j++) {
			SongInfo bestSongs = array80sSongs[j];
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}
		
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
		
		System.out.println("Songs of the 90s\n");
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
		{
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
			
		}
	}
	
	public void showTheSongs2() {
		System.out.println("NEW Way With Iterator\n");
		
		Iterator<?> Songs70s = iter70s.createIterator();
		Iterator<?> Songs80s = iter80s.createIterator();
		Iterator<?> Songs90s = iter90s.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(Songs70s);
		System.out.println("Songs of the 80s\n");
		printTheSongs(Songs80s);
		System.out.println("Songs of the 90s\n");
		printTheSongs(Songs90s);
		
	}
	
	public void printTheSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased() + "\n");
		}
	}
}
