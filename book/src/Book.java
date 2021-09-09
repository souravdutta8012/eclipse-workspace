
public class Book {
	String name;
	int page;
	float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String name, int page, float price) {
		this.name = name;
		this.page = page;
		this.price = price;
	}
}
