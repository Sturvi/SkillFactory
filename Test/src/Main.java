public class Main {
    // write your code here
    public static void main(String[] args) {
        Mage mage = new Mage("Emin", 10, 100, "ice");
        Mage mage1 = new Mage("Eldar", 10, 100, "ice");
        String salam =  mage.fight(mage1);
        System.out.println(salam);

    }
}