public class IncomingPhoneCall extends PhoneCall {
    private String phoneNumber;

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.phoneNumber = phoneNumber;
        getPriceOfTheCall();

    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPriceOfTheCall() {
        return 0.02;
    }

    @Override
    public String getInformationAboutTheCall() {
        return "Phone number : " + getPhoneNumber() + "\nRate per minute : " + getPriceOfTheCall() + "\nPrice of the call : "
                + getPriceOfTheCall();
    }
}
