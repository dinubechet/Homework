public class Circle extends TwoDimnesionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area (){
        return Math.PI*this.radius*this.radius;
    }
    @Override
    public double perimeter (){
        return Math.PI*2*this.radius;
    }
}
