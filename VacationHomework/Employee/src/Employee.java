public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;



    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return getFirstName() + " " + getLastName();
    }
    public double getAnnualSalary(){
        return getSalary()*12;
    }

    public void raiseSalary(double percent){
        double multiplier = 1.0;
        if (percent > 100.0) {
            multiplier = 0;
        }
        this.salary =salary*(multiplier + percent/100.0);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +'\''+
                '}';
    }
}
