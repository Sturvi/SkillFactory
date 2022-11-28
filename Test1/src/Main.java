

public class Main {
    public static void main(String[] args) {
        Human Aydan = new Human ("Aydan", 23, "Graphic Designer", true);
    }
}

class Human {
    String name;
    int age;
    String profession;
    final boolean single;

    public Human(String name, int age, String profession, boolean single) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.single = single;
    }
}

