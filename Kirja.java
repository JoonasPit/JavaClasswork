import java.text.DecimalFormat;

public class Kirja {
	private String name;
	private String isbn;
	private double price;
	private KirjaKustantaja bookpub;
	DecimalFormat f = new DecimalFormat("0.00");
	
	
	public Kirja() {
		name = "";
		isbn = "";
		price = 0;
		bookpub = null;
	}
	public Kirja(String name, String isbn, double price, KirjaKustantaja bookpub) {
		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.bookpub = bookpub;
	}
	
	public void setBookpub(KirjaKustantaja bookpub) {
		this.bookpub = bookpub;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return bookpub.getPubname();
	}
	public String getPubAdd() {
		return bookpub.getAddress();
	}
	public String getPubPhone() {
		return bookpub.getPhonenum();
	}
	
	public KirjaKustantaja getBookpub() {
		return bookpub;
	}
	public String getName() {
		return name;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String ofreturn = "";
		if (!bookpub.equals("")) {
			ofreturn =  "Kirjan nimi: " + name + "\nKirjan isbn: " + isbn +
			"\nKirjan hinta: " + f.format(price) + bookpub.toString();
		}
		else {
		ofreturn =  "Kirjan nimi: " + name + "\nKirjan isbn: " + isbn + "\nKirjan hinta: " + price;
		}
		return ofreturn;
		}

}
