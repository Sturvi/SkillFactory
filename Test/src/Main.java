

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 10; i >= 0; i--) {
            System.out.println("До запуска ракеты осталось: " + i + " секунд");
            Thread.sleep(1000);
        }

        System.out.println("Поехали...");
        System.out.println("");
        System.out.println("");
        Thread.sleep(2000);

        System.out.println("Имформбюро: Юрий Гагарин успешно полетел в космос!");
    }
}