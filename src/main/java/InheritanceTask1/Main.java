package InheritanceTask1;

public class Main {
    public static void main(String[] args) {
        Animal hours = new Animal("hours");
        System.out.println(hours.getName());
        hours.makeSound();

        Animal cat = new Animal("cat");
        cat.makeSound();
    }
}

