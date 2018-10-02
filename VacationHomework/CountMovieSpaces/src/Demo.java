import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CountMovieSpaces firstQuote = new CountMovieSpaces();
        int counter = firstQuote.numberOfSpaces("This is Sparta", ' ');
        System.out.println(counter);

        System.out.println("Enter your favorite movie quote : ");
        int counter2 = firstQuote.numberOfSpacesOfAQuoteFromUser(scan.nextLine(), ' ');
        System.out.println(counter2);
    }
}
