package hw5Q1Constructor;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp01 = new Employee();//default constructor
		
		Employee emp02 = new Employee("Mosharrof");//parameterized constructor 01
		
		Employee emp03 = new Employee("Mosharrof", 483);//parameterized constructor 02
		
		Employee emp04 = new Employee(852, "Yesha");//parameterized constructor 03
		
		Employee emp05 = new Employee(321, 'M');//parameterized constructor 04
		
		Employee emp06 = new Employee("Mosharrof", 483, 'M');//parameterized constructor 05
		
		Employee emp07 = new Employee("Mosharrof", 483, 'M', false);//parameterized constructor 06
		
		Employee emp08 = new Employee("Yesha", 852, false, 'F');//parameterized constructor 07
		
		
	}
	
	

}
