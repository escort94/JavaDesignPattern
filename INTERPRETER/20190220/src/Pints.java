
public class Pints extends Expression{

	@Override
	public String gallons(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity / 8);
	}

	@Override
	public String quarts(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity / 2);
	}

	@Override
	public String pints(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity);
	}

	@Override
	public String cups(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity * 2);
	}

	@Override
	public String tablespoons(double quantity) {
		// TODO Auto-generated method stub
		return Double.toString(quantity * 32);
	}
 
}
