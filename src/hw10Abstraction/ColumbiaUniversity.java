package hw10Abstraction;
// 2 keywords extends and implements

// regular class can inherit only one regular class or abstract class with extends
// regular class can inherit more than one interface with implements

public class ColumbiaUniversity extends MedicalSchool {

	public ColumbiaUniversity() {
		System.out.println("this is default constructor from ColumbiaUniversity");
	}

//	public void chemistry(); a regular class can not have an abstract method. 

	public void biology() {
		System.out.println("this is non-abstract method from columbiaUniversity");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}
