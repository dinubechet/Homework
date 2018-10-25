public class Demo {
    public static void main(String[] args) {
        CourseGrades grades = new CourseGrades();
        System.out.println(grades.toString());
        System.out.println("Average is " + grades.getAverage());
        System.out.println("the highest score is in " + grades.getHighest());
        System.out.println("the lowest score is in " + grades.getLowest());
    }
}
