package hw1JavaBasic;

public class practice {
	
	public static void p1() {
		System.out.print(" IS");
	}
	public static void p2() {
		System.out.print(" HEAD");
	}
	public static void p3() {
		p1();
		System.out.print(" A");
	}
	public static void main(String[] args) {
		System.out.print("BOB");
		p3();
		System.out.print(" MELON");
		p2();
	}
	

}
