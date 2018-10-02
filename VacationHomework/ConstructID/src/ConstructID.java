public class ConstructID {
    public static String theIDConstructor(String firstName, String lastName, String address) {
        String address2 = "";
        String finalID = "";
        /*
        char[] charArray = address.toCharArray();
        for (int i = 0; i < address.length(); i++) {
            if (charArray[i] == ' ') {
                break;
            }
            address2 += charArray[i];
        }*/
        address2 = address.replaceAll("\\D+", "");
        finalID = firstName.toUpperCase().substring(0, 1)
                .concat(lastName.toUpperCase().substring(0, 1)
                        .concat(address2));
        return finalID;
    }
}
