package hw4JavaVariablesDeclared;

public class AboutMe {
	
	public String myName;//variable is declared
	public byte myAge;
	public short myHouseNumber;
	public int myCarPrice;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean fullTimeStudent;
	
	public AboutMe() {//constructor is declared
		System.out.println("This is all about us");
	}
	
	public void aboutMe() {//method is implemented
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy house number: " + myHouseNumber
				+ "\nMy car price: " + myCarPrice + "\nMy bank balance: " + myBankBalance + "\nMy height: " + myHeight
				+ "\nMy grade: " + myGrade + "\nMy Gender: " + myGender + "\nFull time student: " + fullTimeStudent);
	}

}
