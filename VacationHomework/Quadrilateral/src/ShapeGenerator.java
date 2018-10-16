public class ShapeGenerator {
    public static void main(String[] args) {
        Quadrilateral shapes [] =
                {new Rectangle(0,0,10,20),
                 new Parallelogram(0,0,10,20,60),
                 new Square(0,0,10)};

        double area = 0 ;
        for (int i = 0 ; i < shapes.length ; i ++ ){
            shapes [i].toString();
        }
    }
}
