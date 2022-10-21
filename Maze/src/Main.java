import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Хотите ли вы ввести лабиринт в ручную, или сгенирировать случайный лабиринт?");
        System.out.println("Введите Y если хотите ввести массив в ручную.");
        System.out.println("Введите N если хотите сгенерировать случайный лабиринт.");
        String temp = scanner.nextLine();
        while (!temp.equals("Y") || !temp.equals("N"))




        if (temp.equals("Y") || temp.equals("N"))
            getMazeSize();
        else {
            System.out.println("Вы сделали неправильный вывод. Попробуйте снова.");
            System.out.println("Введите Y если хотите ввести массив в ручную.");
            System.out.println("Введите N если хотите сгенерировать случайный лабиринт.");
            String temp = scanner.nextLine();
        }


    }

    private static void getMazeSize() {
        System.out.println("");
    }
}