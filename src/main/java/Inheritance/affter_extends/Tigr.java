package Inheritance.affter_extends;

public class Tigr extends Animal{
    public Tigr(String nickname, String run, int weight) {
        super(nickname, run, weight);
    }
    public void printTigr(){
        System.out.println(super.nickname + " Рычит " +  " его вес " + super.weight + " кг " + " он " + super.run);
    }

}
