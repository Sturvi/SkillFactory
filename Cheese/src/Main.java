import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] parts = new String[5];
        boolean test = imputData(parts);
        if (test) {
            if (((Math.abs(parts[0].charAt(0) - parts[3].charAt(0)) == 2 && Math.abs(parts[1].charAt(0) - parts[4].charAt(0)) == 1) ||
                    (Math.abs(parts[0].charAt(0) - parts[3].charAt(0)) == 1 && Math.abs(parts[1].charAt(0) - parts[4].charAt(0)) == 2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static boolean imputData(String[] parts) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts2 = input.split("");
        for (int i = 0; i < parts2.length; i++) {
            parts[i] = parts2[i];
        }
        boolean test = false;
        if (parts2.length == 5) {
            if ('A' <= input.charAt(0) && input.charAt(0) <= 'H' &&
                    'A' <= input.charAt(3) && input.charAt(3) <= 'H' &&
                    '-' == input.charAt(2) &&
                    Integer.parseInt(parts[1]) > 0 && Integer.parseInt(parts[1]) <= 8 &&
                    Integer.parseInt(parts[4]) > 0 && Integer.parseInt(parts[4]) <= 8) {
                test = true;
            }
        }
        return test;
    }
}