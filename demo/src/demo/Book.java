package demo;

public class Book {
	String name;
	double price;
	String author;
	int code;

	public Book(String name, double price, String author, int code) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
