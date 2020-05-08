
public class Sheep implements Animal {

	
	public Sheep() {
		System.out.println("Sheep is Made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is Being Made");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (Exception e) {
			System.out.println("The Sheep was Turned to Mush");
			e.printStackTrace();
		}
		return sheepObject;
	}

	public String toString() {
		return "Dolly is my Hero, Baaa";
	}
}
