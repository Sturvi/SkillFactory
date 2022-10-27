public class Human {
    // write your code here
    public String name;
    public int age;
    public int weight;
    public  String address;
    public String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        weight=190;
    }


    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        age=190;
        weight=190;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        weight=190;
    }

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
        name="Porn Star";
    }
}
