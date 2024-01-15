package hw10Abstraction;
/*
 * only one keyword extends is used for the inheritance in interface 
 * interface can inherit more than one interface with extends keyword
 * interface can not inherit other class or abstract class
 */

public interface University extends College, Hospital{

	public void classSize();

	public void playGround();

	public void teacher();
	
	public default void gymnasium() {
		
	}
	public static void library () {
		
	}

//	public University() {} interface can not have constructor.

}
