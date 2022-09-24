package homework6.animal;

public class TestAnimal {

	public static void main(String[] args) {
        
		Cat cat1 = new Cat("snow");
        cat1.greets();
        Dog dog1 = new Dog("alaska");
        dog1.greets();
        BigDog bigDog1 = new BigDog("husky");
        bigDog1.greets();

        Animal animal1 = new Cat("snow");
        animal1.greets();
        Animal animal2 = new Dog("alaska");
        animal2.greets();
        Animal animal3 = new BigDog("husky");
        animal3.greets();
        // Animal animal4 = new Animal("gorden");

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        // Cat cat2 = (Cat) animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
	}

}
