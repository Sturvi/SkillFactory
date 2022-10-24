import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.creatingANewPet();
        cat.catMenu();
        System.out.println("К сожалению ваш питомец убежал!");
    }
}