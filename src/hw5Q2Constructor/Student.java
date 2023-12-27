package hw5Q2Constructor;

public class Student {
	
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgrammer;
	public float grade;
	
	public Student() {
		System.out.println("This is from the default Constructor of the Student class");
	}

	public Student(String stName, int stId, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + "\tId: " + stId + "\tGender: " + sex + "\tGrade: " + grade + "\tJava Programmer: " + isProgrammer);
	}
	
	
	
	

}
