import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	
	public StockGrabber() {

		observers = new ArrayList<Observer>();
	}

	public void register(Observer o) {
		// TODO Auto-generated method stub
	observers.add(o);	
	}

	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(o);
		
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		
		observers.remove(observerIndex);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}
	
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		notifyObserver();
		
	}
	
	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		notifyObserver();
	}

}
