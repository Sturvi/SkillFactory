import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = inputData();
        boolean test = input.matches("([A-H][1-8]-[A-H][1-8])");
        String[] parts = input.split("");
        canTheHouseMakeThisMove(test, parts);
    }

    private static String inputData() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    private static void canTheHouseMakeThisMove(boolean test, String[] parts) {
        if (test) {
            if ((Math.abs(parts[0].charAt(0) - parts[3].charAt(0)) == 2 && Math.abs(parts[1].charAt(0) - parts[4].charAt(0)) == 1) ||
                    (Math.abs(parts[0].charAt(0) - parts[3].charAt(0)) == 1 && Math.abs(parts[1].charAt(0) - parts[4].charAt(0)) == 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}