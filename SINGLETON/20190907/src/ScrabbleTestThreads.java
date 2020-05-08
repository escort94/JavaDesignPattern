
public class ScrabbleTestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}

}
