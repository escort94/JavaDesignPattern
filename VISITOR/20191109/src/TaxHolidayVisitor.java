import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	
	public TaxHolidayVisitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double visit(Liquor liquorItem) {
		// TODO Auto-generated method stub
		System.out.println("Liquor Item: Price with Tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .10)+ liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tabaccoItem) {
		// TODO Auto-generated method stub
		System.out.println("Tobacco Item: Price with Tax");
		return Double.parseDouble(df.format((tabaccoItem.getPrice()  * .30) +tabaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		// TODO Auto-generated method stub
		System.out.println("Necessity Item: Price with Tax");
		return Double.parseDouble(df.format(necessityItem.getPrice()));
	}

}
