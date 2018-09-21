public class TestCircle {
    public static void main(String[] args) {
        Circle cirlce1 = new Circle(1,1,1);
        MyPoint point2 = new MyPoint(2,2);

        Circle circle2 = new Circle(point2,2);
        cirlce1.distance(circle2);
    }
}
