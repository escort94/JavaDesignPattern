
public class AnimalPlay {

	public static void main(String[] args) {

		Animal sparky = new Dog();
		Animal tweety =  new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + sparky.tryToFly());
	}

}
