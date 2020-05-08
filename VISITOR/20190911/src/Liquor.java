
public class Liquor implements Visitable {

	private double price;
	Liquor(double item) {
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
