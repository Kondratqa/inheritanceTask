package Inheritance.affter_extends;

public class Animal {

    String nickname;
    String run;
    int weight;
    String sound;

    public Animal(String nickname, String run, int weight, String sound) {
        this.nickname = nickname;
        this.run = run;
        this.weight = weight;
        this.sound = sound;

    }
    public String getNickname() {
        return nickname;
    }
    public String getRun() {
        return run;
    }
    public int getWeight() {
        return weight;
    }

    public  void makeSound(){
        System.out.println("Животное издает звук");
    }
    public  void printAnimal(){
        System.out.println(nickname + " " + sound + " " + run + " его вес " + weight + " кг ");
    }
}

