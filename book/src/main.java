import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of books:");
		int total = scan.nextInt();
		scan.nextLine();

		Book[] bookarr = new Book[total];

		for (int i = 0; i < total; i++) {
			bookarr[i] = new Book("", 0, 0);
			System.out.println("Enter " + i + " book name:");
			bookarr[i].setName(scan.nextLine());
			System.out.println("Enter " + i + " book page:");
			bookarr[i].setPage(scan.nextInt());
			scan.nextLine();
			System.out.println("Enter " + i + " book price:");
			bookarr[i].setPrice(scan.nextFloat());
			scan.nextLine();
		}

		scan.close();
		display(bookarr);

		Book[] booksort = SortBook(bookarr);

		display(booksort);
	}

	public static void display(Book[] bookarr) {
		for (int i = 0; i < bookarr.length; i++) {
			System.out.println("Name: " + bookarr[i].getName());
			System.out.println("Page: " + bookarr[i].getPage());
			System.out.println("Price: " + bookarr[i].getPrice() + "\n");
		}
	}

	public static Book[] SortBook(Book[] bookarr) {
		for (int i = 0; i < bookarr.length; i++) {
			for (int j = 0; j < bookarr.length - i; j++) {
				if (bookarr[j].getPrice() > bookarr[j + 1].getPrice()) {
					Book tempbook = bookarr[j + 1];
					bookarr[j + 1] = bookarr[j];
					bookarr[j] = tempbook;
				}
			}
		}

		return bookarr;
	}
}
