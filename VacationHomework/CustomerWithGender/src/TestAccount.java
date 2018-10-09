public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(2,"Dinu",'m');
        Account account1 = new Account(2,customer,200);
        account1.deposit(50);
        System.out.println(account1);
        account1.withdraw(150);
        System.out.println(account1);
    }
}
