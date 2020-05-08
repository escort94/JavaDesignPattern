import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	
	public StockGrabber() {
		// TODO Auto-generated constructor stub
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
	public void notifiyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
		notifiyObserver();
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifiyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifiyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifiyObserver();
	}

	
}
