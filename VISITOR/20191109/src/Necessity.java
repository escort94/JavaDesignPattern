
public class Necessity implements Visitable {

	private double price;
	
	
	public Necessity(double price) {
		super();
		this.price = price;
	}


	@Override
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	public double getPrice() {
		return price;
	}

}
