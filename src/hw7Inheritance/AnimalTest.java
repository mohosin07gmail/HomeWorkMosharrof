package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		Birds birds = new Birds();
		Dog dog = new Dog();
		Snake snake = new Snake();
		Robin robin = new Robin();
		BullDog bullDog = new BullDog();
		Cobra cobra = new Cobra();
		
				
		cobra.cobraInfo();
		cobra.snakeInfo();// this is single inheritance
		cobra.reptileInfo();//this is multi-level inheritance
		cobra.animalInfo();
		
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		mammal.mammalInfo();
		mammal.animalInfo();// this is hierarchy inheritance
		
		reptile.reptileInfo();
		reptile.animalInfo();// this is hierarchy inheritance
		
		birds.birdsInfo();
		birds.animalInfo();// this is hierarchy inheritance
		
		animal.animalInfo();
		
		

	}

}
