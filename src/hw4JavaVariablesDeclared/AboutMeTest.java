package hw4JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();//constructor is initialized
		aboutMe.myName = "Mosharrof";
		aboutMe.myAge = 37;//variable is initialized
		aboutMe.myHouseNumber = 56;
		aboutMe.myCarPrice = 30000;
		aboutMe.myBankBalance = 10000;
		aboutMe.myHeight = 5.8f;
		aboutMe.myGrade = 4.25;
		aboutMe.myGender = 'M';
		aboutMe.fullTimeStudent = false;
		aboutMe.aboutMe();//method is initialized
		System.out.println("==============================================");

		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myAge = 40;
		alex.myHouseNumber = 72;
		alex.myCarPrice = 15000;
		alex.myBankBalance = 50000;
		alex.myHeight = 5.5f;
		alex.myGrade = 3.75;
		alex.myGender = 'M';
		alex.fullTimeStudent = false;
		alex.aboutMe();

	}

}
