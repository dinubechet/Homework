import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last  name: ");
        String lastName = scan.nextLine();
        System.out.println("Please enter your address: ");
        String address = scan.nextLine();
        System.out.println(ConstructID.theIDConstructor(firstName,lastName,address));
    }
}
