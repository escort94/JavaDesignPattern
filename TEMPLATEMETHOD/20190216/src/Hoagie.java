
public abstract class Hoagie {
	boolean afterFirstCondiment = false;
	
	final void makeSandwitch() {
		cutBun();
		
		if(customerWantsMeat()) {
			addMeat();
			
			afterFirstCondiment = true;
		}
		
		if(customerWantsCheese()) {
			if(afterFirstCondiment) {System.out.println("\n");}
			
			addCheese();
			
			afterFirstCondiment = true;
		}
		
		if(customerWantsVegetables()) {
			if(afterFirstCondiment) {System.out.println("\n");}
			addVegetables();
			afterFirstCondiment = true;
		}
		if(customerWantsCondiments()) {
			if(afterFirstCondiment) {System.out.println("\n");}
			addCondiments();
			afterFirstCondiment = true;
		}
		
		wrapTheHoagie();
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	public void cutBun() {
		System.out.println("\n\n");
		System.out.println("The Hoagie is Cut");
	}
	
	boolean customerWantsMeat() {return true;}
	boolean customerWantsCheese() {return true;}
	boolean customerWantsVegetables() {return true;}
	boolean customerWantsCondiments() {return true;}
	
	public void wrapTheHoagie() {
		System.out.println("\nWrap the Hoagie");
	}
	
	public void afterFirstCondiment() {
		System.out.println("\n");
	}
}
