package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from the default constructor of computer class");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My Brand:" + brand + "\tModel:" + model + "\tOperating system:" + operatingSystem + "\tPrice: $"
				+ price + "\tGrade: " + grade + "\tMade in Usa: " + madeInUsa);
	}

}
