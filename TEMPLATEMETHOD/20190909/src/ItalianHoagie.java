
public class ItalianHoagie extends Hoagie{

	String[] meatUsed = {"Salami", "Pepperoni","Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] veggiesUsed = {"Lettuce","Tomatoes","Onions","Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};
	
	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		System.out.print("Adding the Meat: ");
		for (String meat : meatUsed) {
			System.out.print(meat + " ");
		}
	}

	@Override
	void addCheese() {
		// TODO Auto-generated method stub
		System.out.print("Adding the Cheese: ");
		for(String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
	}

	@Override
	void addVegetables() {
		// TODO Auto-generated method stub
		System.out.print("Adding the Vegetables: ");
		for(String vegetable : veggiesUsed) {
			System.out.print(vegetable + " ");
		}
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.print("Adding the condiments: ");
		for(String condiment : condimentsUsed) {
			System.out.print(condiment  +  " ");
		}
	}

}
