import java.util.ArrayList;

public class StockMediator implements Mediator {

	
	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSaleOffers;
	
	private int colleagueCodes = 0;
	
	
	
	public StockMediator() {
		super();
		this.colleagues = new ArrayList<Colleague>();
		this.stockBuyOffers = new ArrayList<StockOffer>();
		this.stockSaleOffers = new ArrayList<StockOffer>();
	}

	public void addColleague(Colleague colleague) {
		// TODO Auto-generated method stub
		colleagues.add(colleague);
		
		colleagueCodes++;
		colleague.setCollCode(colleagueCodes);
	}

	public void saleOffer(String stock, int shares, int collCode) {
		
		boolean stockSold = false;
		for(StockOffer offer: stockBuyOffers) {
			if((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares) ) {
				
				System.out.println(shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());
				
				stockBuyOffers.remove(offer);
				
				stockSold = true;
			}
			if(stockSold) {break;}
		}
		
		if(!stockSold) {
			System.out.println(shares + " shares of "+ stock + " added to inventory");
			StockOffer newOffering = new StockOffer(shares, stock, collCode);
		}
	} 
	public void buyOffer(String stock, int shares, int collCode) {
		boolean stockBought = false;
		for(StockOffer offer: stockSaleOffers) {
			if((offer.getStockSymbol() == stock ) && (offer.getStockShares() == shares)) {
				System.out.println(shares + " shares of" + stock + " bought by colleage code " + offer.getColleagueCode());
				
				stockSaleOffers.remove(offer);
				stockBought = true;
			}
			if(stockBought) {break;}
		} 
		
		if(!stockBought) {
			System.out.println(shares + " shares of " + stock + " added to inventory ");
			StockOffer newOffering = new StockOffer(shares, stock, collCode);
			
			stockBuyOffers.add(newOffering);
			}
		}
		
	public void getstockOfferings() {
		System.out.println("\nStocks for Sale");
		for(StockOffer offer: stockSaleOffers) {
			System.out.println(offer.getStockShares() + " of "+ offer.getStockSymbol());
		}
		System.out.println("\nStock Buy Offers");
		
		for(StockOffer offer: stockBuyOffers) {
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
		}
	}
}
