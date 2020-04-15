package AdvancedAuthor;
//we can make one book with many authors
import java.util.Arrays;

public class Book {
	
	private Author authors[]; //we are making Book class dependable on the Author class and then we make array if we have multiple authors
	private String name;
	private int price;
	private int qty;
	public Book(Author[] authors, String name, int price, int qty) {
		super();
		this.authors = authors;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public Book(Author[] authors, String name, int price) {
		this.authors = authors;
		this.name = name;
		this.price = price;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [authors=" + Arrays.toString(authors) + ", name=" + name + ", price=" + price + ", qty=" + qty
				+ "]";
	}

	
	
	
	
}
