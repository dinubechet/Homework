public class CourseGrades implements Analyzable {

    private GradeActivity[] grades;

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

    @Override
    public double getAverage() {
        return (labActivity.getScore() + pass_FailExam.getScore() + essay.getScore() + finalExam.getScore()) / 4;
    }

    @Override
    public GradeActivity getHighest() {

        if (labActivity.getScore() > pass_FailExam.getScore() && labActivity.getScore() > essay.getScore() &&
                labActivity.getScore() > finalExam.getScore()) {

            return labActivity;
        }else if (pass_FailExam.getScore() > labActivity.getScore() && pass_FailExam.getScore() > essay.getScore() &&
        pass_FailExam.getScore() > finalExam.getScore()) {
            return pass_FailExam;
        }else if ( essay.getScore() > labActivity.getScore() && essay.getScore() > pass_FailExam.getScore() && essay.getScore() > finalExam.getScore()) {
            return essay;
        }else return  finalExam;

     /*   double highest = grades[0].getScore();
        for (int i = 1 ; i < grades.length ; i++){
            if ( highest > grades[i].getScore() ){
                highest = grades[i].getScore();
            }
        }*/

        }


    @Override
    public GradeActivity getLowest() {
        if (labActivity.getScore() < pass_FailExam.getScore() && labActivity.getScore() < essay.getScore() &&
                labActivity.getScore() < finalExam.getScore()) {

            return labActivity;
        }else if (pass_FailExam.getScore() < labActivity.getScore() && pass_FailExam.getScore() < essay.getScore() &&
                pass_FailExam.getScore() < finalExam.getScore()) {
            return pass_FailExam;
        }else if ( essay.getScore() < labActivity.getScore() && essay.getScore() < pass_FailExam.getScore() && essay.getScore() < finalExam.getScore()) {
            return essay;
        }else return  finalExam;
    }
}
