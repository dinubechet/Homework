public class Demo {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.annualInterestRate = 1 + 0.004;

        saver1.calculateMonthlyInterest(SavingsAccount.annualInterestRate, saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest(SavingsAccount.annualInterestRate, saver2.getSavingsBalance());

        System.out.println("The balance for saver 1 is : " + saver1.getSavingsBalance());
        System.out.println("The balance for saver 2 is : " + saver2.getSavingsBalance());

        SavingsAccount.annualInterestRate = 1 + 0.005;

        saver1.calculateMonthlyInterest(SavingsAccount.annualInterestRate, saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest(SavingsAccount.annualInterestRate, saver2.getSavingsBalance());

        System.out.println("The new balance for saver 1 is : " + saver1.getSavingsBalance());
        System.out.println("The new balance for saver 2 is : " + saver2.getSavingsBalance());
    }
}
