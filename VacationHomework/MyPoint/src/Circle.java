public class Circle {
    private MyPoint center;
    private int radius;

    public Circle() {
        this.center = new MyPoint(0,0);
    }

    public Circle(int x , int y , int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public Circle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){

        return new int [] {getCenterX(), getCenterY()} ;
    }

    public void setCenterXY( int x , int y){
        setCenterX(x);
        setCenterY(y);
    }

    public double getArea(){
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    public double getCircumference(){
        double diameter = 2*getRadius();
        double circumference = Math.PI*diameter;
        return circumference;
    }

    public double distance (Circle anotherCircle){
      /*  MyPoint point = anotherCircle.getCenter();
        double distance = Math.sqrt(Math.pow(point.getX()-getCenterX(),2)+(Math.pow(point.getY()-getCenterY(),2)));
        System.out.println(distance);*/
        return this.getCenter().distance(anotherCircle.getCenter());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
