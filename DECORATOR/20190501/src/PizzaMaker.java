
public class PizzaMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza basicPizza = new TomatoSauce(new Mozzarella(new ThreeCheesePizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		
		System.out.println("Price: " + basicPizza.getCost());
	}

}
