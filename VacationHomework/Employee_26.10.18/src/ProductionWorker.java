public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String employeeName, String employeeID, String hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeID, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;

        if (shift == 1){
            System.out.println("Day shift");
        }else if (shift == 2){
            System.out.println("Night shift");
        }else System.out.println("invalid shift");
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "employeeName='" + getEmployeeName() + '\'' +
                ", employeeID='" + getEmployeeID() + '\'' +
                ", hireDate='" + getHireDate() + '\'' +
                "shift=" + shift +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }
}
