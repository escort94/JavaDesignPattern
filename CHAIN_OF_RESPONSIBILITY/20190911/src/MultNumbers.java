
public class MultNumbers implements Chain {

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain newChain) {
		// TODO Auto-generated method stub
		this.nextInChain = newChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalcWanted() == "mult") {
			System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));
		} else {
			nextInChain.calculate(request);
			
		}
	}

}
