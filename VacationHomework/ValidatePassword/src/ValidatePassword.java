import java.util.*;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scan.nextLine();
        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                uppercase++;
            }
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                lowercase++;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                digits++;
            }
        }
        if (uppercase < 2 || lowercase < 2 || digits < 2) {
            System.out.println("This password is invalid because ");

            if (uppercase < 2) {
                System.out.println("there should be at least two upper case letters in it.");
            }
            if (lowercase < 2) {
                System.out.println("there should be at least two lower case letters in it.");
            }
            if (digits < 2) {
                System.out.println("there should be at least two digits in it.");
            }

        }  else {
            System.out.println("This is a valid password!");
        }

    }
}
