package Inheritance.affter_extends;

public class Animal {

    protected String nickname;
    protected String run;
    protected int weight;  

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

