package InheritanceTask1;

public class Horse {
    private String nickname;

    public Horse(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    public void makeSound() {
        System.out.println("Лошадь ржот");
    }
}
