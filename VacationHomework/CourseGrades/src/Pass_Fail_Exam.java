public class Pass_Fail_Exam extends GradeActivity {
    public Pass_Fail_Exam(double score) {
        super(score);
    }

    public void scoreChecker ( double score ) {
        if (score >= 70){
            System.out.println("You passed");
        }else {
            System.out.println("You failed");
        }
    }
}
