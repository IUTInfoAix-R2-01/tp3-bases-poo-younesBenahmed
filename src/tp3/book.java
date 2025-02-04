package tp3;

public class book {  
	
	private String name;
	private Author authors; 
	private double price;
	private int qty = 0 ;
	private String isbn; 
	
	public book(String isbn, String name, Author authors, double price) { 
		this.isbn = isbn; 
		this.authors = authors;
		this.price = price;
	}
	
	public book(String isbn, String name, Author authors, double price, int qty) {
		this.isbn = isbn; 
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() { 
		return authors; 
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty; 
	}
	
	public void setQty(int qty) {
		this.qty = qty; 
	}
	
	public String getIsbn() {
		return isbn ; 
	}
	public String toString() {

		return "Book [isbn = "+ isbn +", name = " + name + ", authors = [" + authors + "] , price = " + price + ", qty = " + qty + " ]";
	}
	
	public String getAuthorName() { 
	
		return authors.getName();

	}
	
	public String getAuthorEMail() { 
		return authors.getEmail(); 
	}
}
