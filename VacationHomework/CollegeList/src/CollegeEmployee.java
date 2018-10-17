public class CollegeEmployee extends Person {
    private int socialSecurityNumber;
    private double annualSalary;
    private String departmentName;

    @Override
    public void setInfo(){
        super.setInfo();
        socialSecurityNumber = inputInt("Social Security Number : ");
        annualSalary = inputDouble("Annual salary : ");
        departmentName = inputString("Department name : ");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Social security number : " + socialSecurityNumber + "\nAnnual Salary : " + annualSalary +
                "\nDepartment name : " + departmentName);
    }
}
