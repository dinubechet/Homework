import java.awt.geom.Point2D;

public class Parallelogram extends Quadrilateral {

    double base = 0.0;
    double heights = 0.0;
    double angle = 0.0;

    public Parallelogram() {
        super();
    }

    public Parallelogram(double x, double y, double width, double heights, double angle) {
        super();
        base = width;
        this.heights = heights;
        this.angle = angle;

        double tanValue = 0.0;
        double baseDistance = 0.0;

        if (angle != 90) {
            tanValue = Math.tan(angle);
            baseDistance = tanValue / heights;
        }
        topleft = new Point2D.Double(x, y);
        topright = new Point2D.Double(x + width, y);
        bottomLeft = new Point2D.Double(x - baseDistance, y + heights);
        bottomRight = new Point2D.Double((x - baseDistance) + width, y + heights);
    }

    @Override
    public double calculateArea() {
        return base * heights;

    }
    @Override
    public String toString() {
        System.out.println("Name of class is : " + getClass());
        System.out.println("Top-Left         : (" + topleft.getX() + ", " + topleft.getY() + ")");
        System.out.println("Top-Right        : (" + topright.getX() + ", " + topright.getY() + ")");
        System.out.println("Bottom-Left      : (" + bottomLeft.getX() + ", " + bottomLeft.getY() + ")");
        System.out.println("Bottom-Right     : (" + bottomRight.getX() + ", " + bottomRight.getY() + ")");
        System.out.println("Base             : " + base);
        System.out.println("Height           : " + heights);
        System.out.println("Area             : " + calculateArea());
        System.out.println("Angle            : " + angle);

        return "";
    }
}
