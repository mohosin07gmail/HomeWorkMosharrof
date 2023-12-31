package hw6Methods;

public class FullName {

	public String fullName(String fName, String lName) {
		String fullName = fName + " " + lName;
		System.out.println("Family Member: " + fullName);

		return null;
	}

	public static void main(String[] args) {
		FullName fullName = new FullName();

		fullName.fullName("abul", "hussain");
		fullName.fullName("babul", "hussain");
		fullName.fullName("cabul", "hussain");
		fullName.fullName("dabul", "hussain");
	}

}
