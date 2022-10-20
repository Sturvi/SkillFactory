import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] parts = new String[5];
        imputData(parts);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

    public static void imputData(String[] parts) {
        String input = "H6-J4";
        parts = input.split("");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}
