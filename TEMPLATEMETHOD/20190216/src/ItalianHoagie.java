
public class ItalianHoagie extends Hoagie {

	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	void addMeat() {

		System.out.println("Adding the Meat: ");
		for (String meat : meatUsed) {
			System.out.println(meat + " ");
		}
	}

	void addCheese() {
		System.out.println("Adding the Cheese:");
		for (String cheese : cheeseUsed) {
			System.out.println(cheese + " ");
		}
	}

	void addVegetables() {

		System.out.println("Adding the Vegetables: ");
		for (String vegetable : veggiesUsed) {
			System.out.println(vegetable + " ");
		}
	}

	void addCondiments() {

		System.out.println("Adding the Condiments: ");
		for (String condiment : condimentsUsed) {

			System.out.print(condiment + " ");

		}

	}

}
