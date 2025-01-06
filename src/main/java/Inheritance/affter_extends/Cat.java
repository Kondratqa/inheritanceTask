package Inheritance.affter_extends;

public class Cat extends Animal{    

    public Cat(String nickname, String run, int weight) {
        super.nickname = nickname;
        super.run = run;
        super.weight = weight;
    }
    public  void printCat(){
        System.out.println(super.nickname + " мяукает, " + super.run + " его вес " + super.weight + " кг ");
    }
}
