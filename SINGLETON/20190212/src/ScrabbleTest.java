import java.util.HashMap;
import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		
		for(int i=0; i< 10; i++) {
			HashMap<String, String> hashmap = new HashMap<String, String>();
			hashmap.put("key" + i, "value" + i);
			Singleton.getInstance().displayObject(hashmap);
		}
		
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("2nd Instance ID : " + System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
	}
}
