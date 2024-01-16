package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super();// super method can call parent class constructor
		super.father();// super keyword can call methods from parent class
		System.out.println("this is default constructor from Daughter");

	}

	public Daughter(String birthMonth, int age) {
		super("mosharrof", 37, 'M', false);// super method can call parameterized constructor from parent class
		super.familyName = "hussain";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter constructor" + "\tBirth Month: " + birthMonth + "\tage: " + age + "\tFamily name: "
				+ familyName);
	}

	public void daughter() {
		System.out.println("this is void type daughter method");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.familyName = "hussain";// super keyword can be used inside method
		System.out.println(
				"Daughter Info: " + "\tBirth Month: " + birthMonth + "\tage: " + age + "\tFamily name: " + familyName);
	}

}
