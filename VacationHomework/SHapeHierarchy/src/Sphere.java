public class Sphere extends ThreeDimentionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return ((Math.PI*this.radius*this.radius*this.radius*4)/3.0);

    }
    @Override
    public double getSurfaceArea(){
        return 4*Math.PI*this.radius*this.radius;

    }
}
