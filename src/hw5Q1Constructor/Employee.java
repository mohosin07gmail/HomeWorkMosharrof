package hw5Q1Constructor;

public class Employee {
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	public Employee() {
		System.out.println("This constructor is from employee class");
	}
	
	public Employee(String empName) {//parameterized constructor 01
		this.empName = empName;
		System.out.println("Employee name: " + empName);
	}
	
	public Employee(String empName, int empId) {//parameterized constructor 02
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee name: " + empName + " Employee Id: " + empId);
	}
	
	public Employee(int empId, String empName) {//parameterized constructor 03
		this.empId = empId;
		this.empName = empName;
		System.out.println("emp name: " + empName + "emp Id: " + empId);
	}
	
	public Employee(int empId, char empGender) {//parameterized constructor 04
		this.empId = empId;
		this.empGender = empGender;
		System.out.println("Employee Id: " + empId + "Employee gender: " + empGender);
	}
	
	public Employee(String empName, int empId, char empGender) {//parameterized constructor 05
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		System.out.println("parameterized constructor 05: " + empName + empId + empGender);
	}
	
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {//parameterized constructor 06
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("parameterized constructor 06: " + empName + empId + empGender + fullTimeEmployee);
	}
	public Employee(String empName, int empId, boolean fullTimeEmployee, char empGender) {//parameterized constructor 07
		this.empName = empName;
		this.empId = empId;
		this.fullTimeEmployee = fullTimeEmployee;
		this.empGender = empGender;
		System.out.println("parameterized constructor 07: " + empName + empId + fullTimeEmployee + empGender);
	}
	
	

}
