public class Demo {
    public static void main(String[] args) {
        IntegerSet firstSet = new IntegerSet();
        IntegerSet secondSet = new IntegerSet();

        firstSet.insertElement(1);
        firstSet.insertElement(2);
        firstSet.insertElement(3);


        System.out.println("First Set is: " + firstSet.toString());

        secondSet.insertElement(3);
        secondSet.insertElement(4);
        secondSet.insertElement(5);

        System.out.println("Second Set is: " + secondSet.toString());
        System.out.println("The union between first and second sets is: " + IntegerSet.union(firstSet, secondSet).toString());
        System.out.println("The intersection between first and second sets is:: " + IntegerSet.intersection(firstSet, secondSet).toString());
        System.out.println("The difference between first and second sets is:: " + IntegerSet.difference(firstSet,secondSet).toString());

    }
}