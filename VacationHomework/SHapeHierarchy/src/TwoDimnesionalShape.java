public class TwoDimnesionalShape extends Shape {

    public double perimeter(){
        return 0.00;
    }

    public double area(){
        return 0.00;
    }

    @Override
    public String toString() {
        return String.format("Area : %.2f\nPerimeter : %.2f\n",area(),perimeter());
    }
}
