
public class Pints extends Expression {

	public String gallons(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity/8);
	}

	public String quarts(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity/2);
	}

	public String pints(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity);
	}

	public String cups(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity*2);
	}

	public String tablespoons(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity*32);
	}

}
