import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        String number = scan.nextLine();

        System.out.println(PhoneNumberFormat.formatingNumber(number));
    }
}
