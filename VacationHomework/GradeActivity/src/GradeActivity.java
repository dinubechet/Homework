public class GradeActivity {

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void getGrade(double score) {
        if (score >= 90) System.out.println("A");
        else if (score >= 75) System.out.println("B");
        else if (score >= 50) System.out.println("C");
        else System.out.println("fail");
    }
}
