public class Main {
    // write your code here
    public static void main(String[] args) {
        int [][] mas = {{1,0}, {2,3}, {3,-5}};
        LimitingRectangle limitingRectangle = new LimitingRectangle(mas);
        System.out.println(limitingRectangle.getWidth() +" "+ limitingRectangle.getHeight());
     //  limitingRectangle.limitingRectangle();
        System.out.println(limitingRectangle.getBorders());
    }
}