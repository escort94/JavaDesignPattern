
public class ThreeCheesePizza implements Pizza {

	private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
	private double cost = 10.50;
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
