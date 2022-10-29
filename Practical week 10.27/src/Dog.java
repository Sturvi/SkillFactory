public class Dog {
    // write your code here
    private String name;
    private int age;
    private String woof;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String bark(){
        return woof;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
