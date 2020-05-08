
public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;

	public ToppingDecorator(Pizza tempPizza) {
		super();
		this.tempPizza = tempPizza;
	}
	
	public String getDescription() {
		return tempPizza.getDescription();
	}
	
	public double getCost() {
		return tempPizza.getCost();
	}
}
