package animalTask;

public class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    public void animalSound() {
        System.out.println(name + " " + " " + sound);

    }
}
