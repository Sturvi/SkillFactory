public class Tank {

    int x, y;
    int dir;
    int fuel;

    public Tank() {
        fuel=100;
    }
    public Tank(int x, int y) {
        this.x=x;
        this.y=y;
        this.fuel=100;

    }

    public Tank(int x, int y, int fuel) {
        this.x=x;
        this.y=y;
        this.fuel=fuel;
    }

    public void goForward(int i) {
        if (fuel!=0 && fuel-Math.abs(i)<=0) {
            i = i<0?(-fuel):fuel;
            if (dir == 0) x += i;
            else if (dir == 1) y += i;
            else if (dir == 2) x -= i;
            else y -= i;
            fuel=0;
        } else if (fuel!=0 && Math.abs(i)>0) {
            if (dir == 0) x += i;
            else if (dir == 1) y += i;
            else if (dir == 2) x -= i;
            else y -= i;
            fuel=i<0?(fuel+i):(fuel-i);
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
