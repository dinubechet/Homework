public class Cube extends ThreeDimentionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return this.side*this.side*this.side;
    }

    public double getSurfaceArea(){
        return this.side*this.side*6;
    }
}
