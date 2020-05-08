
public class Tobacco implements Visitable {

	private double price;
	
	Tobacco(double item) {
		price = item;
	}
	
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

}
