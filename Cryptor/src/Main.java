public class Main {
    public static void main(String[] args) {
        String x = encrypt("Salam chan zu rik.", 5);
        System.out.println(x);
        x = decrypt(x , 5);
        System.out.println(x);
    }

    public static String encrypt (String text, int shift) {
        char[] temp = text.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] >= 65 && temp[i] <= 90)) {
                temp[i] += shift;
                if (temp[i] > 90) temp[i] -= 26;
                if (temp[i] <65) temp[i] += 26;

            }
            if (temp[i] >= 97 && temp[i] <= 122) {
                temp[i] += shift;
                if (temp[i] > 122) temp[i] -= 26;
                if (temp[i] < 97) temp[i] += 26;
            }
        }
        return String.valueOf(temp);
    }

    public static String decrypt (String text, int shift) {
        return encrypt(text, -shift);
    }
}