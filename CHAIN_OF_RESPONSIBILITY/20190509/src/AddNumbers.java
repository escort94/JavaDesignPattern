
public class AddNumbers implements Chain {

	private Chain nextInChain;
	
	
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		nextInChain = nextChain;
	}

	public void calculate(Numbers request) {
		// TODO Auto-generated method stub

		if(request.getCalcWanted() == "add") {
			System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
		} else {
			nextInChain.calculate(request);
		}
	}


}
