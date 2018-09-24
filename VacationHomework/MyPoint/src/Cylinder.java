public class Cylinder extends ColouredCircle{

    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius , double height){
        this.height=height;
        this.setRadius(radius);
    }

    public Cylinder(double radius , double height , String color){
        this.height=height;
        this.setRadius(radius);
        this.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        double volume = this.getArea()*this.getHeight();
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
