public class Square extends Quadrilateral {
    public Square(double side1, double side2) {
        super(side1, side2);
    }
    @Override
    public double area (){
        return this.getSide1()*this.getSide2();
    }
    @Override
    public double perimeter(){
        return this.getSide1()*4;
    }
}
