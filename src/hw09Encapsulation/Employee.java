package hw09Encapsulation;

public class Employee {

	private String name;
	private int age;
	private char sex;
	private boolean citizen;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public boolean isCitizen() {
		return citizen;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}

}
