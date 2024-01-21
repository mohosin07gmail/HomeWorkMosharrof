package hw13Polymorphism;
/*
 * we can have multiple method with same method name with different parameter
 * even with the same parameter but with different sequence
 */

public class Sister {
	
	
	public void sister() {
		System.out.println("this is void type non-parameterized sister method");
	}
	
	public int sister(int age1) {
		System.out.println("sister age is: " + age1);
		return age1;
	}
	
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int totalAge1  = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("this is totalAge 1: " + totalAge1);
		return totalAge1;
	}
	
	public static int sister(int age1, int age2, int age3) {
		int totalAge2 = age1 + age2 + age3;
		System.out.println("this is totalAge 2 which is static: " + totalAge2);
		return totalAge2;		
	}
	
	public final int sister(int age1, int age2) {
		int totalAge3 = age1 + age2;
		System.out.println("this is totalAge3 which is final: " + totalAge3);
		return totalAge3;
	}

}
