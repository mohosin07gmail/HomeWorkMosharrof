package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		Niece niece = new Niece();
		sister.sister();
		sister.sister(35);
		sister.sister(35, 40, 45, "50", 55, 60);
		sister.sister(35, 40);
		Sister.sister(35, 40, 45);
		niece.sister();
		niece.sister(35);
		niece.sister(35, 40, 45, "50", 55, 60);

	}

}
