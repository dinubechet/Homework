public class Student extends Person {
    private String majorField;
    private double agp;

    @Override
    public void setInfo(){
        majorField = inputString("Major field of study");
        agp = inputDouble("Average grade point");
    }
}
