package hw4JavaVariablesInitialized;

public class MyInfoTest {

	public static void main(String[] args) {

		MyInfo myInfo = new MyInfo();

		System.out.println(myInfo.myName);
		System.out.println(myInfo.myAge);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.myGender);
		System.out.println(myInfo.usCitizen);

		System.out.println("My Name: " + myInfo.myName);
		System.out.println(myInfo.myName + myInfo.myAge);
		System.out.println("Name: " + myInfo.myName + " Age: " + myInfo.myAge);

		System.out.println("=========================================");

		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge + "\nMy Apartment Rent: "
				+ myInfo.myApartmentRent + "\nMy Yearly Salary" + myInfo.myYearlySalary + "\nMy Bank Balance: "
				+ myInfo.myBankBalance + "\nMy Height: " + myInfo.myHeight + "\nMy Grade: " + myInfo.myGrade
				+ "\nMy Gender: " + myInfo.myGender + "\nUs Citizen: " + myInfo.usCitizen);
	}

}
