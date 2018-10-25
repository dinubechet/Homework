public class CourseGrades {

    private GradeActivity[] grades ;

    GradeActivity labActivity = new LabActivity(70);
    GradeActivity pass_FailExam = new Pass_Fail_Exam(80);
    GradeActivity essay = new Essay(85);
    GradeActivity finalExam = new FinalExam(90);

    public void setLab(GradeActivity labActivity) {
        grades[0] = labActivity;
    }

    public void setPassFailExam(Pass_Fail_Exam pass_FailExam) {
        grades[1] = pass_FailExam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {
        return "CourseGrades{" +
                "labActivity=" + labActivity.getScore() +
                ", pass_FailExam=" + pass_FailExam.getScore() +
                ", essay=" + essay.getScore() +
                ", finalExam=" + finalExam.getScore() +
                '}';
    }
}
