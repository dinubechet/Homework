import java.util.*;

public class Demo {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = scan.nextLine();
        boolean isPolindrom = Polindrome.polindromeString(word);
        System.out.println(isPolindrom);
    }
}
