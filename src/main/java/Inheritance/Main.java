package Inheritance;

import Inheritance.affter_extends.Animal;
import Inheritance.affter_extends.Horse;

public class Main {
    public static void main(String[] args) {

        Animal myHorse = new Horse("Rysak", 100);
        //myHorse.getNickname();
        System.out.println(myHorse.getNickname());
        


    }
}

