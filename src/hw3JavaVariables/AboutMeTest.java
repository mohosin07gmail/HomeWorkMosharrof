package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();// constructor is initialized here.

		System.out.println("My Name: " + aboutMe.myName + "\nMy Age: " + aboutMe.myAge + "\nMy house number: "
				+ aboutMe.myHouseNumber + "\nMy car price: " + aboutMe.myCarPrice + "\nMy bank balance: "
				+ aboutMe.myBankBalance + "\nMy height: " + aboutMe.myHeight + "\nMy grade: " + aboutMe.myGrade
				+ "\nMy Gender: " + aboutMe.myGender + "\nFull time student: " + aboutMe.fullTimeStudent);
	}

}
