public class Bread {
    private String breadType;
    private double caloriesPerSlice;

    public static final String MOTTO = "The staff of life.";

    public String getBreadType() {
        return breadType;
    }

    public double getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public Bread(String breadType, double caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public void displayInfo() {
        System.out.println("The bread type is : " + getBreadType());
        System.out.println("Calories per slice : " + getCaloriesPerSlice());
        System.out.println(MOTTO);
    }
}
