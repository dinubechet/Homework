public class ThreeDimentionalShape extends Shape{
    public double getVolume(){
        return 0.00;
    }

    public double getSurfaceArea(){
        return 0.00;
    }

    @Override
    public String toString() {
        return String.format("Surface area: %.2f\nVolume: %.2f\n",getSurfaceArea(),getVolume());
    }
}
