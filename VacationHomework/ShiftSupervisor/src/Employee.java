

public class Employee {
    private String employeeName;
    private String employeeID;
    private String hireDate;

    public Employee(String employeeName, String employeeID, String hireDate) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
