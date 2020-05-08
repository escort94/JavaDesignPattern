import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	
	public TaxHolidayVisitor() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double visit(Liquor liquorItem) {
		// TODO Auto-generated method stub
		System.out.println("Liquor Item: Price with Tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		// TODO Auto-generated method stub
		System.out.println("Tobacco Item: Price with Tax");
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {

		System.out.println("NecessityItem Item: Price with tax");
		
		return Double.parseDouble(df.format(necessityItem.getPrice()));
	}

}
