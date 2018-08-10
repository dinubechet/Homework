import java.util.Scanner;

public class LargeSmallInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int input1, 
            input2, 
            input3, 
            input4, 
            input5,
            largest,
            smallest;

        System.out.print("Enter first integer: ");
        input1 = input.nextInt();

        System.out.print("Enter second integer: ");
        input2 = input.nextInt();

        System.out.print("Enter third integer: ");
        input3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        input4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        input5 = input.nextInt();

        largest = input1;
        smallest = input1;

        if (input2 > largest)
            largest = input2;
        if (input3 > largest)
            largest = input3;
        if (input4 > largest)
            largest = input4;
        if (input5 > largest)
            largest = input5;

        if (input2 < smallest)
            smallest = input2;
        if (input3 < smallest)
            smallest = input3;
        if (input4 < smallest)
            smallest = input4;
        if (input5 < smallest)
            smallest = input5;

        System.out.printf("Largest of five integers is %d, and smallest is %d%n", largest, smallest);
    }
}