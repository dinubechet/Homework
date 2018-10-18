public class PhoneCallArray {
    IncomingPhoneCall incoming1 = new IncomingPhoneCall("1");
    IncomingPhoneCall incoming2 = new IncomingPhoneCall("2");
    IncomingPhoneCall incoming3 = new IncomingPhoneCall("3");
    IncomingPhoneCall incoming4 = new IncomingPhoneCall("4");
    IncomingPhoneCall incoming5 = new IncomingPhoneCall("5");

    OutgoingPhoneCall outGo1 = new OutgoingPhoneCall("1",1);
    OutgoingPhoneCall outGo2 = new OutgoingPhoneCall("2",2);
    OutgoingPhoneCall outGo3 = new OutgoingPhoneCall("3",3);
    OutgoingPhoneCall outGo4 = new OutgoingPhoneCall("4",4);
    OutgoingPhoneCall outGo5 = new OutgoingPhoneCall("5",5);

    PhoneCall[] mixCalls = {incoming1,incoming2,incoming3,incoming4,incoming5,outGo1,outGo2,outGo3,outGo4,outGo5};

    public void displayCallsInfo(){
        for (PhoneCall aPhoneCallsArray : mixCalls) {
            System.out.println(aPhoneCallsArray.getInformationAboutTheCall());
        }
    }

}
