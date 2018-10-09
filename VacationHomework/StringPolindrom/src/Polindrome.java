public class Polindrome {
    public static boolean polindromeString(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
