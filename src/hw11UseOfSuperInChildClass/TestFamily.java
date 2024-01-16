package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Father father01 = new Father();
		Father father02 = new Father("Mosharrof", 37, 'M', true);

		father01.father();
		father01.fatherInfo("Mosharrof", 37, 'M', true);

		Daughter daughter01 = new Daughter();
		Daughter daughter02 = new Daughter("November", 6);

		daughter01.daughter();
		daughter01.daughterInfo("November", 6);

	}

}
