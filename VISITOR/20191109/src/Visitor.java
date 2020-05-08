
public interface Visitor {

	public double visit(Liquor liquorItem);
	public double visit(Tobacco tabaccoItem);
	public double visit(Necessity necessityItem);
}
