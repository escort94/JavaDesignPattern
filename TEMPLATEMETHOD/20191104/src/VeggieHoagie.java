
public class VeggieHoagie extends Hoagie {

	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void addCheese() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void addVegetables() {
		// TODO Auto-generated method stub
		System.out.println("Adding the Vegetables:");
		for(String vegetable : veggiesUsed) {
			System.out.println(vegetable + " ");
		}
	}
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding the Condiments: ");
		for(String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}
	}

}
