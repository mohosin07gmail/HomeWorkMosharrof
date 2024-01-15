package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Mosharrof");
		employee.setAge(37);
		employee.setSex('M');
		employee.setCitizen(true);

		System.out.println("My name: " + employee.getName() + "\nMy age: " + employee.getAge() + "\nMy sex: "
				+ employee.getSex() + "\nCitizen: " + employee.isCitizen());

	}

}
