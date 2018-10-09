public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        setRadius(1);
    }

    public Circle( double radius ){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = (Math.PI * (radius * radius));
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void showInfo(){
        System.out.println("The radius is : " + getRadius());
        System.out.println("The diameter is : " + getDiameter());
        System.out.println("The area is : " + getArea());
    }
}
