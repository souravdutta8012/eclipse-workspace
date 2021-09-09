package student;

public class student {
	String name;
	int roll;
	char gender;
	int marks;

	public student(String name, int roll, char gender, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.gender = gender;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
