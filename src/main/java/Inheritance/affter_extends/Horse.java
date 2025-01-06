package Inheritance.affter_extends;

public class Horse extends Animal{

    public Horse(String nickname, int weight, String run) {
        super(nickname, run, weight);
    }        
    public void printHorse(){
        System.out.println(super.nickname + " Ржет " +  " его вес " + super.weight + " кг " + " он " + super.run);        
    }
}
