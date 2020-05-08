
public class Necessity implements Visitable {

	private double price;
	
	Necessity(double item){
		price = item;
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
