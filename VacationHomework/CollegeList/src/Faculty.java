public class Faculty extends CollegeEmployee {

    private boolean isTenured;
    private String option;

    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Tenured? Y/N : ");
        if (option.equals("Y")||option.equals("y")){
            isTenured = true;
        }else{
            isTenured = false;
        }
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tenured : " + isTenured);
    }

}
