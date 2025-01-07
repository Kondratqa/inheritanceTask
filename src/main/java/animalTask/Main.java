package animalTask;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("", "");
        myAnimal.makeSound();

        Dog myDog = new Dog("Pan");
        myDog.animalSound();

        Cat myCat = new Cat("Barsik");
        myCat.animalSound();

        Cow myCow = new Cow("Mu-Mu");
        myCow.animalSound();

        Sheep mySheep = new Sheep("Marusya");
        mySheep.animalSound();

        Bird myBird = new Bird("Picuha");
        myBird.animalSound();
    }
}
