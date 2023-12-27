package hw5Q2Constructor;

public class Employee {
	
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	public Employee() {
		System.out.println("this is all about our employee");
	}

	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		
		System.out.println("Employee name:" + empName + "Employee Id: " + empId + "Employee Gender: " + empGender + "Full time employee: " + fullTimeEmployee);
	}
	
	
	
	

}
