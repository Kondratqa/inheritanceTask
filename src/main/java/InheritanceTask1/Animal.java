package InheritanceTask1;

public class Animal {

    private String name;


    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public void makeSound() {
        if (this.name.equals("hours")){
            System.out.println("Лошадь ржет");
        }else if (this.name.equals("cat")){
            System.out.println("Кот мяукает");
        }
    }
}



