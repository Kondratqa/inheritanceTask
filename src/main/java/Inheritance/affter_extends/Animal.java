package Inheritance.affter_extends;

public class Animal {
    
    String nickname;
    String run;
    int weight;   

    public Animal(String nickname, String run, int weight) {
        this.nickname = nickname;
        this.run = run;
        this.weight = weight;
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
    
}

