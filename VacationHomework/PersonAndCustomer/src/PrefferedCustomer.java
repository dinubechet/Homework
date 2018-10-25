public class PrefferedCustomer extends Customer {

    private double amountOfPurchase;
    private double customerDiscount;

    public PrefferedCustomer(String personName, String personAddress, String personPhoneNumber, int customerNumber, boolean isOnMailingList,
                             double amountOfPurchase) {
        super(personName, personAddress, personPhoneNumber, customerNumber, isOnMailingList);
        this.amountOfPurchase = amountOfPurchase;
        this.customerDiscount = getCustomerDiscount();
    }

    public double getAmountOfPurchase() {
        return amountOfPurchase;
    }

    public void setAmountOfPurchase(double amountOfPurchase) {
        this.amountOfPurchase = amountOfPurchase;
    }

    public double getCustomerDiscount() {
        if (amountOfPurchase > 2000){
          return  this.customerDiscount = 0.1;
        }else if (amountOfPurchase > 1500){
          return  this.customerDiscount = 0.07;
        }else if (amountOfPurchase > 1000) {
            return this.customerDiscount = 0.06;
        }else if (amountOfPurchase > 500){
            return this.customerDiscount = 0.05;
        }else return this.customerDiscount = 0.00;
    }

    public double applyDiscount(){
        return amountOfPurchase / (1+customerDiscount);

    }


}
