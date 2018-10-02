import java.util.*;

public class PhoneNumberFormat {


    public static String formatingNumber(String number) {
        String finalNo = "";
        String firstParanthese = "(";
        String secondParanthese = ")";
        String space = " ";
        String dash = "-";
        char[] charArray = number.toCharArray();
        System.out.println(charArray[0]);
        for (int i = 0; i < number.length(); i++) {
            if (i == 0) {
                finalNo += firstParanthese.concat(number.substring(0,3).concat(secondParanthese).concat(space));
            }
            if ( i == 6){
                finalNo += number.substring(3,6).concat(dash).concat(number.substring(6,10));
            }
        }
        return finalNo;
    }
}
