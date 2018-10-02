public class Polindrome {
    public static boolean polindromeString(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (charArray[i] != charArray[word.length() - 1 - i]) {
            return false;
            }
        }
        return true;
    }
}
