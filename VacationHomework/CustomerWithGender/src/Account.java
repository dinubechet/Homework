public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=$" + balance +
                '}';
    }

    public String getCustomerName() {
        return this.customer.getName();
    }



    public Account deposit(double amount) {
        setBalance(getBalance() + amount);
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            setBalance(getBalance() - amount);
        }else System.out.println("Amount withdraw exceeds the current balance!");
        return this;
    }
}
