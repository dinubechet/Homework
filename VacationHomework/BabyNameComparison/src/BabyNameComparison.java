import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name : ");
        String firstName = scan.nextLine();
        System.out.println("Enter another name : ");
        String secondName = scan.nextLine();
        System.out.println("and another name : ");
        String thirdName = scan.nextLine();


            System.out.println(firstName + " " + secondName);
            System.out.println(firstName + " " + thirdName);
            System.out.println(secondName + " " + firstName);
            System.out.println(secondName + " " + thirdName);
            System.out.println(thirdName + " " + firstName);
            System.out.println(thirdName + " " + secondName);

    }
}
