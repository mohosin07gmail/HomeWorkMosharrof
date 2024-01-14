package hw8Abstraction;

public abstract class MedicalSchool {
	
	public MedicalSchool() {
		System.out.println("this is a constructor from medicalSchool abstract class");
	}
	
	public abstract void anatomyLab ();
	
	public void biochemistryLab() {
		System.out.println("this is biochemistryLab non-abstract method");
	}
	
	

}
