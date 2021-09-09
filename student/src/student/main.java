package student;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of student:");
		int total = scan.nextInt();
		scan.nextLine();

		student[] stud = new student[total];

		for (int i = 0; i < total; i++) {
			System.out.println("Name:");
			String name = scan.nextLine();

			System.out.println("Roll:");
			int roll = scan.nextInt();
			scan.nextLine();

			System.out.println("Gender:");
			char gender = scan.nextLine().charAt(0);

			System.out.println("Marks:");
			int marks = scan.nextInt();
			scan.nextLine();

			stud[i] = new student(name, roll, gender, marks);
		}

		scan.close();

		display(stud);

		change(stud);

		display(stud);
	}

	public static void change(student[] stud) {
		for (int i = 0; i < stud.length; i++) {
			if (stud[i].getMarks() > 90) {
				stud[i].setMarks(stud[i].getMarks() - 10);
			} else if (stud[i].getMarks() < 90 && stud[i].getMarks() > 50) {
				stud[i].setMarks(stud[i].getMarks() + 10);
			}
		}
	}

	public static void display(student[] stud) {
		for (int i = 0; i < stud.length; i++) {
			System.out.println("Name:" + stud[i].getName() + "\nRoll:" + stud[i].getRoll() + "\nGender:"
					+ stud[i].getGender() + "\nMarks:" + stud[i].getMarks() + "\n");
		}
	}

}
