public class ColouredCircle {

    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double area = Math.PI *(Math.pow(radius,2));
        return area;
    }

    @Override
    public String toString() {
        return "ColouredCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
