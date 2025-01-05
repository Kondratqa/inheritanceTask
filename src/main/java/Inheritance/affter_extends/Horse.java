package Inheritance.affter_extends;

public class Horse extends Animal{

    private int weight;

    public Horse(String nickname, int weight) {
        super(nickname);
        this.weight = weight;
        System.out.println(weight);
    }
    public void printName(){
        System.out.println(super.nickname);
    }
}
