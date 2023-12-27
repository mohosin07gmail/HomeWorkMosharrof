package hw5Q2Constructor;

public class NarrowingCasting {

	public static void main(String[] args) {

		double myGrade = 3.45874552211122;
		System.out.println("What is my Grade? Ans: " + myGrade);

		int newMyGrade = (int) myGrade;
		System.out.println("What is my Grade? Ans: " + newMyGrade);

		byte byteMyGrade = (byte) myGrade;
		System.out.println("What is my Grade? Ans: " + byteMyGrade);

	}

}
