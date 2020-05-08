
public class TestCloning {

	public static void main(String[] args) {

		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getCole(sally);
		
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
		
	}

}
