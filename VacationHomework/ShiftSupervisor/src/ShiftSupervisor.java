public class ShiftSupervisor extends Employee {

    public double getAnnualSalary() {
        return annualSalary + annualProductionBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String employeeName, String employeeID, String hireDate, double annualSalary, double annualProductionBonus) {
        super(employeeName, employeeID, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    @Override
    public String toString() {
        return "ShiftSupervisor{" +
                "employeeName='" + getEmployeeName() + '\'' +
                ", employeeID='" + getEmployeeID() + '\'' +
                ", hireDate='" + getHireDate() + '\'' +
                "annualSalary=" + annualSalary +
                ", annualProductionBonus=" + annualProductionBonus +
                '}';
    }
}
