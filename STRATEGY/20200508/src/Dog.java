
public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dub a hole");
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		
		setSound("Bark");
		
		flyingType = new CantFly();
	}
	
	
}
