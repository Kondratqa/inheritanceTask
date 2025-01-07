package Inheritance;


import Inheritance.affter_extends.*;


public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("","",0, "");
        myAnimal.makeSound();
        
        Horse horse = new Horse("Rysak", 100, "Бегает");        
        horse.printAnimal();

        Cat cat = new Cat("Barsik", "бегает,", 7);
        cat.printAnimal();

        Tigr tigr = new Tigr("Шерхан", "бегает", 25);
        tigr.printAnimal();

        Voron voron = new Voron("Каркуша", "Летает", 2);
        voron.printAnimal();
        voron.makeSound();
    }
}

