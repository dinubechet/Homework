public class OutgoingPhoneCall extends PhoneCall {
    private String phoneNumber;
    private double timeOfTheCall;



    public double getRatePerMinute() {
        return getPriceOfTheCall();
    }


    public OutgoingPhoneCall(String phoneNumber , double numberOfMinutes) {
        super(phoneNumber);
        this.phoneNumber = phoneNumber;
        this.timeOfTheCall = numberOfMinutes;
    }

    public double getTimeOfTheCall() {
        return timeOfTheCall;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double getPriceOfTheCall() {
        return 0.04;
    }

    @Override
    public String getInformationAboutTheCall() {
        return "Phone number : " + getPhoneNumber() + "\nRate per minute : " + getRatePerMinute() + "\nNumber of minutes : " +
                getTimeOfTheCall() + "\nPrice of the call : "
                + getRatePerMinute()* getTimeOfTheCall();
    }
}
