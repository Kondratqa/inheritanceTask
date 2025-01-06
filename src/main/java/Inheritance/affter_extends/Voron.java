package Inheritance.affter_extends;

public class Voron extends Animal {

    String fly;

    public Voron(String nickname, String fly, int weight) {
        super(nickname, fly, weight,"Каркает");
    }
    @Override
    public void makeSound() {
        System.out.println("Voron is sound");
    }
}
