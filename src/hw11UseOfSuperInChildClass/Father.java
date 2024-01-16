package hw11UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("this is default construcor from Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father constructor" + "\tname: " + name + "\tage: " + age + "\tsex: " + sex
				+ "\tusCitizen: " + usCitizen);
	}

	public void father() {
		System.out.println("this is void type father method");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println(
				"Father Info: " + "\tname: " + name + "\tage: " + age + "\tsex: " + sex + "\tusCitizen: " + usCitizen);
	}

}
