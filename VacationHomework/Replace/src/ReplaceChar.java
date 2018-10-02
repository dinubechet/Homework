public class ReplaceChar {
    public String replaceChar(String strng, char oldChar, char newChar) {
        char[] text = strng.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (oldChar == text[i]) {
                text[i] = newChar;
            }
        }
        return new String(text);
    }

    public String replaceCharFromIndex(String stringToBeModified, char toBeReplaced, char replaceChar, int index) {
        char[] strng = stringToBeModified.toCharArray();
        for (int i = index; i < strng.length; i++) {
            if (toBeReplaced == strng[i]) {
                strng[i] = replaceChar;
            }
        }
        return new String(strng);
    }

    public String replaceCharTimes(String stringToBeModified, char toBeReplaced, char replaceChar, int counter) {
        char[] strng = stringToBeModified.toCharArray();
        int internalCounter=0;

        for (int i = 0; i < strng.length; i++) {
                if (toBeReplaced == strng[i]) {
                    strng[i] = replaceChar;
                   internalCounter++;
                    if ( internalCounter >= counter){
                        break;
                    }
                }
            }


        return new String(strng);
    }
}
