public abstract class PhoneCall {
    private String phoneNumber;
    private double priceOfTheCall;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.priceOfTheCall = 0.00;
    }
    public abstract String getPhoneNumber();

    public abstract double getPriceOfTheCall();

    public abstract String getInformationAboutTheCall();
}
