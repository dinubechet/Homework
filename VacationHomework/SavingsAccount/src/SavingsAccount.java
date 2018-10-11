public class SavingsAccount {
    static double annualInterestRate ;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest (double annualInterestRate , double savingsBalance){
        double monthlyInterest = (savingsBalance* annualInterestRate)/12;
       this.savingsBalance += monthlyInterest;

    }

    public static void modifyInterestRate ( double annualInterestRate ){
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}
