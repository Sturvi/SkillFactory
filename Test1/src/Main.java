public class Main {
    public static void main(String[] args) {
        NewLife newLife = new NewLife();
        Life.setLife(newLife.lifeEditor(Life.getLife(), "Negotive"));
    }
}

class NewLife {
    public String lifeEditor(String life, String regex) {
        return life.replaceAll(regex, "");
    }
}