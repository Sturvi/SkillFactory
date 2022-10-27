public class Programmer {
    // write your code here
    public String name;
    public String company;
    private String position;
    private String[] allPosition = {"intern", "junior", "middle", "senior", "lead"};
    private int counter = 0;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        position=allPosition[counter];
        counter++;
    }


    public String getPosition() {
        return position;
    }

    public void work(){
        position=allPosition[counter];
        counter=counter<4?++counter:counter;
    }
}
