public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("079208100");
        System.out.println(incomingPhoneCall.getInformationAboutTheCall());

        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("079201800",5);
        System.out.println(outgoingPhoneCall.getInformationAboutTheCall());

        PhoneCallArray phoneCallArray = new PhoneCallArray();
        phoneCallArray.displayCallsInfo();
    }
}
