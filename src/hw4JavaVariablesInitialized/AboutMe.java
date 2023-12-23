package hw4JavaVariablesInitialized;

public class AboutMe {

	// variable is declared here
	public String variableDeclared;

	// variables are initialized here.
	public String myName = "Mosharrof";
	public byte myAge = 37;
	public short myHouseNumber = 56;
	public int myCarPrice = 30000;
	public long myBankBalance = 10000l;
	public float myHeight = 5.8f;
	public double myGrade = 4.25;
	public char myGender = 'M';
	public boolean fullTimeStudent = false;

	// constructor is declared here
	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	public void aboutMe() {// method is implemented 
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy house number: " + myHouseNumber
				+ "\nMy car price: " + myCarPrice + "\nMy bank balance: " + myBankBalance + "\nMy height: " + myHeight
				+ "\nMy grade: " + myGrade + "\nMy Gender: " + myGender + "\nFull time student: " + fullTimeStudent);
	}

}
