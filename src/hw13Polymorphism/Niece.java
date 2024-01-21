package hw13Polymorphism;
/*
 * method overriding means we can bring any method from parent class and change the logic inside it
 */

public class Niece extends Sister {
	
	@Override
	public void sister() {
		System.out.println("this is overridden void type sister method");
	}
	
	@Override
	public int sister(int age1) {
		System.out.println("overridden sister age is: " + age1);
		return age1;
	}
	
	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int totalAge1  = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("overridden this is totalAge 1: " + totalAge1);
		return totalAge1;
	}
	/*
	 * static and final type methods can not be overridden
	 * because static is a personal property of the class
	 * because when some method is final that means its final not changeable
	 */


}
