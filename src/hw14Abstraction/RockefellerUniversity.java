package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void maths() {
		System.out.println("this is non-abstract maths method from RockefellerUniversity");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("this is overriden aeronauticalInfo method");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("this is overriden mechanicalLab method");
		
	}

}
