package Inheritance;


import Inheritance.affter_extends.Animal;
import Inheritance.affter_extends.Cat;
import Inheritance.affter_extends.Horse;


public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("","",0);
        myAnimal.makeSound();
        
        Horse horse = new Horse("Rysak", 100, "Бегает");        
        horse.printHorse();

        Cat cat = new Cat("Barsik", "бегает,", 7);
        cat.printCat();
    }
}

