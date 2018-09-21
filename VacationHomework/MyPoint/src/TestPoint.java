public class TestPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1,1);
        MyPoint point2 = new MyPoint(2,2);
        point1.distance(point2);
        point1.distance(point2.getX(),point2.getY());
    }
}
