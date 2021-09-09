package demo;

import java.util.Scanner;

public class donku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of books:");
		int total = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter word to search:");
		String word = sc.nextLine();

		Book[] bk = new Book[total];

		for (int i = 0; i < total; i++) {
			bk[i] = new Book("", 0, "", 0);

			System.out.println("Enter name:");
			bk[i].setName(sc.nextLine());

			System.out.println("Enter price:");
			bk[i].setPrice(sc.nextDouble());
			sc.nextLine();

			System.out.println("Enter author:");
			bk[i].setAuthor(sc.nextLine());

			System.out.println("Enter code:");
			bk[i].setCode(sc.nextInt());
			sc.nextLine();
		}

		sc.close();

		System.out.println("Before sort:");
		display(bk, total);

		Book[] bk1 = sortByName(bk, total);

		System.out.println("After sort:");
		display(bk1, total);

		int count = findWord(bk1, total, word);
		System.out.println("Count of word: " + count);

		Book[] bk2 = reverseName(bk1, total);

		System.out.println("After name reverse:");
		display(bk2, total);

		int count1 = findVowel(bk2, total);
		System.out.println("Count of vowel: " + count1);
	}

	public static int findVowel(Book[] bk2, int total) {
		int count1 = 0;
		for (int i = 0; i < total; i++) {
			char[] tempCharArr = bk2[i].getName().toCharArray();
			for (int j = 0; j < tempCharArr.length; j++) {
				if (tempCharArr[j] == 'a' || tempCharArr[j] == 'e' || tempCharArr[j] == 'i' || tempCharArr[j] == 'o'
						|| tempCharArr[j] == 'u') {
					count1++;
				}
			}
		}
		return count1;
	}

	public static Book[] reverseName(Book[] bk1, int total) {
		for (int i = 0; i < total; i++) {
			String tempName = "";
			char[] tempCharArr = bk1[i].getName().toCharArray();
			for (int j = 0; j < tempCharArr.length; j++) {
				tempName += tempCharArr[tempCharArr.length - j - 1];
			}
			bk1[i].setName(tempName);
		}
		return bk1;
	}

	public static int findWord(Book[] bk, int total, String word) {
		int count = 0;
		for (int i = 0; i < total; i++) {
			if (bk[i].getName().contains(word)) {
				count++;
			}
		}
		return count;
	}

	public static Book[] sortByName(Book[] bk, int total) {
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total - i - 1; j++) {
				if (bk[j].getName().toLowerCase().compareTo(bk[j + 1].getName().toLowerCase()) > 0) {
					Book tempbk = bk[j];
					bk[j] = bk[j + 1];
					bk[j + 1] = tempbk;
				}
			}
		}
		return bk;
	}

	public static void display(Book[] bk, int total) {
		for (int i = 0; i < total; i++) {
			System.out.println(bk[i].getName() + "\n" + bk[i].getPrice() + "\n" + bk[i].getAuthor() + "\n"
					+ bk[i].getCode() + "\n");
		}
	}
}