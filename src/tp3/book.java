package tp3;

public class book {  
	
	private String name;
	private Author[] authors; 
	private double price;
	private int qty = 0 ;
	
	public book(String name, Author[] authors, double price) { 
		this.authors = authors;
		this.price = price;
	}
	
	public book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthor() { 
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
	
	public String toString() {
		String authorList = "";
		for (Author author : authors) {
			authorList += author.toString() + ", "; 
		}

		return "Book [name = " + name + ", authors = [" + authorList + "] , price = " + price + ", qty = " + qty + " ]";
	}
	
	public String getAuthorName() { 
		String liste  = ""; 
		for (Author author : authors) { 
			liste += author.getName() + ", "; 		}
		return liste;
	}
	
	public String getAuthorEMail() { 
		String emails = "";
		for (Author author : authors) { 
			emails += author.getEmail() + ", "; 
		}
		return emails;
	}
}
