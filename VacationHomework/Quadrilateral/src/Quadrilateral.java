import java.awt.geom.Point2D;

public abstract class Quadrilateral {
    public Point2D topleft = new Point2D.Double (0.0,0.0);
    public Point2D topright = new Point2D.Double(0.0,0.0);
    public Point2D bottomLeft = new Point2D.Double(0.0,0.0);
    public Point2D bottomRight = new Point2D.Double(0.0,0.0);

    public abstract double calculateArea();
}
