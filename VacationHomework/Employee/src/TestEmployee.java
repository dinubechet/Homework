public class TestEmployee {


    public static void main(String[] args) {
        Employee employee = new Employee(123456, "Dinu", "Bechet", 800);
        System.out.println(employee);
        System.out.println("The annual salary=" + employee.getAnnualSalary());
        employee.raiseSalary(150.0);
        System.out.println("the increased salary is=" + employee.getSalary() );
        System.out.println(employee);
    }
}
