public class Customer extends Person {

    private int customerNumber;
    private boolean isOnMailingList;

    public Customer(String personName, String personAddress, String personPhoneNumber, int customerNumber, boolean isOnMailingList) {
        super(personName, personAddress, personPhoneNumber);
        this.customerNumber = customerNumber;
        this.isOnMailingList = isOnMailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingList() {
        return isOnMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        isOnMailingList = onMailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + "personName='" + getPersonName() + '\'' +
                ", personAddress='" + getPersonAddress() + '\'' +
                ", personPhoneNumber='" + getPersonPhoneNumber() + '\'' +
                "customerNumber=" + customerNumber +
                ", isOnMailingList=" + isOnMailingList +
                '}';
    }
}
