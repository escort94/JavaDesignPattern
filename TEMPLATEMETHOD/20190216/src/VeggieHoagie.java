
public class VeggieHoagie extends Hoagie {

	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};


	void addVegetables() {
	
		System.out.println("Adding the Vegetables: ");
		for (String vegetable : veggiesUsed) {
			System.out.println(vegetable + " ");
		}
	}

	
	void addCondiments() {
	 System.out.println("Adding the Condiments: ");
		for(String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}
	}

	void addMeat() {}
	void addCheese() {}
}
