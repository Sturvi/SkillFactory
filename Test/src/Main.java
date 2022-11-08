public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        int[] b = new int[2];
        b[0] = 1;
        b[1] = 2;
        a=test(a, b);
        System.out.println(a);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }

    private static Integer test(Integer a, int[] b) {
        a = 6;
        b[0] = 5;
        b[1] = 4;
        return a;
    }
}