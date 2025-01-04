package InheritanceTask1;

public class Cat {
    private String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
    public void makeSound() {
        System.out.println("Кот мяукает");
    }
}
