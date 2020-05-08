
public class Originator {

	private String article;
	public void set(String newArticle) {
		System.out.println("From Orginator: Current Version  of Article\n" + newArticle + "\n");
		this.article = newArticle;
	}
	
	public Memento storeInMemento() {
		System.out.println("From Orginator: Saving to Memento");
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getSavedArticle();
		System.out.println("From Orginator: Previous Article Saved in Memento\n"  + article + "\n");
		
		return article;
	}
}
