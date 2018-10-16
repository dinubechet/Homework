public class Triangle extends TwoDimnesionalShape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double area() {
        double half = perimeter() / 2;
       return Math.sqrt(half * (half - this.side1) * (half - this.side2) * (half - this.side3));

    }
}
