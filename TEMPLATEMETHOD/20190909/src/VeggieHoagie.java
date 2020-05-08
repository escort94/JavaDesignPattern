
public class VeggieHoagie extends Hoagie {

	String[] veggiesUsed = {"Lettuce","Tomatoes","Onions","Sweet Peppers"};
	String[] condimentsUsed = {"Oil","Vinegar"};
	
	boolean customerWantsMeat() {return false;}
	boolean customerWantsCheese() { return false;}
	

	void addVegetables() {
		// TODO Auto-generated method stub
		System.out.print("Adding the Vegetables: ");
		for(String vegetable : veggiesUsed) {
			System.out.print(vegetable + " ");
		}
	}

	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.print("Adding the Condiments: ");
		for(String condiment: condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}

	void addMeat() {}
	
	void addCheese() {}
	
}
