package hw6Methods;

public class MyFamily {

	public int child1Age = 5;
	public int child2Age = 7;
	public int child3Age = 9;

	public int myFamily() {
		int sumOfAge = child1Age + child2Age + child3Age;
		System.out.println("the sum of my childrens age is: " + sumOfAge);
		return sumOfAge;
	}

	public static void main(String[] args) {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();
	}

}
