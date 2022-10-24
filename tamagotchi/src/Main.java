import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Cat cat = new Cat();
        System.out.println("Добро пожаловать в нашу игру");
        System.out.println("Выберите действие для начала игры");
        System.out.println("Создать нового питомца (1)");
        System.out.println("Загрузить сохраненную игру (2)");
        Scanner scanner = new Scanner(System.in);
        boolean test=false;
        while (!test){
            char menuSelection = scanner.next().charAt(0);
            switch (menuSelection) {
                case ('1'):
                    cat.creatingANewPet();
                    test=true;
                    break;
                case ('2'):
                    cat.resumeGame();
                    test=true;
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
        System.out.println("Надеюсь скоро вы вернетесь в игру");
    }
}