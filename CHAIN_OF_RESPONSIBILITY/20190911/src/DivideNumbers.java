
public class DivideNumbers implements Chain {

	@SuppressWarnings("unused")
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain newChain) {
		// TODO Auto-generated method stub
		this.nextInChain = newChain;
	}
	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if (request.getCalcWanted() == "div") {
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + "="
					+ (request.getNumber1() / request.getNumber2()));
		} else {
			System.out.println("Only works for add, sub, mult, and div");
		}
	}

}
