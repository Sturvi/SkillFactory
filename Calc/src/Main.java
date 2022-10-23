import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (startCalculator()) ;
    }

    private static boolean startCalculator() {
        double firstNumber = scanner.nextInt();
        char action;
        double secondNumber;
        while (true) {
            action = scanner.next().charAt(0);
            switch (action) {
                case ('+'):
                    secondNumber = scanner.nextInt();
                    firstNumber += secondNumber;
                    System.out.println(firstNumber);
                    break;
                case ('-'):
                    secondNumber = scanner.nextInt();
                    firstNumber -= secondNumber;
                    System.out.println(firstNumber);
                    break;
                case ('*'):
                    secondNumber = scanner.nextInt();
                    firstNumber *= secondNumber;
                    System.out.println(firstNumber);
                    break;
                case ('/'):
                    secondNumber = scanner.nextInt();
                    firstNumber /= secondNumber;
                    System.out.println(firstNumber);
                    break;
                case ('C'):
                    return true;
                case ('s'):
                    return false;
                default:
                    System.out.println("Вы ввели неверные данные. Попробуйте снова.");
            }
        }
    }
}