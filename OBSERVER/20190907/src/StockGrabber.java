import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(o);
		
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observers)
			o.update(ibmPrice, aaplPrice, googPrice);
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		
		notifyObserver();
	}
	

}
