package homework5.animal;

public class TestMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal("black");
		System.out.println(animal);
		
		Animal mammal = new Mammal("human");
		System.out.println(mammal);
		
		Cat cat = new Cat("snow");
		System.out.println(cat);
		cat.greets();
		
		Dog dog = new Dog("husky");
		System.out.println(dog);
		dog.greets();
		dog.greets(dog);
	}

}
