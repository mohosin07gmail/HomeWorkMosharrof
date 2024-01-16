package hw12Abstraction;
// 2 keywords extends and implements can be used in abstract class
// abstract class can inherit only one regular class or abstract class with extends
// abstract class can inherit more than one interface with implements

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() {
		System.out.println("this is a constructor from medicalSchool abstract class");
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is biochemistryLab non-abstract method");
	}

}
