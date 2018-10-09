public class MyPoint {
    private int x = 0;
    private int y = 0;


    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXy() {
        return new int[]{getX(), getY()};
    }

    public void setXy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + (Math.pow(y - this.y, 2)));
        System.out.println(distance);
        return distance;

    }

    public double distance(MyPoint anotherPoint) {
        double distance = Math.sqrt(Math.pow(this.x - anotherPoint.getX(), 2) +
                Math.pow(this.y - anotherPoint.getY(), 2));
        System.out.println(distance);
        return distance;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
