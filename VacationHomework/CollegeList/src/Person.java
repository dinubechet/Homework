import javafx.scene.paint.PhongMaterial;

import java.util.*;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private int zipCode;
    private int phoneNumber;


   Scanner scanString = new Scanner(System.in);
   Scanner scanInt = new Scanner(System.in);

   public String inputString (String text){
       System.out.println(text);
       return scanString.nextLine();
   }

   public int inputInt(String num){
       System.out.println(num);
       return scanInt.nextInt();
   }

   public double inputDouble(String text){
       System.out.println(text);
       return scanInt.nextDouble();
   }

   public void setInfo (){
       firstName = inputString("First name : ");
       lastName = inputString("Last name : ");
       zipCode = inputInt("Zip Code : ");
       phoneNumber = inputInt("Phone Number : ");
   }

   public void displayInfo (){
       System.out.println("Name : " + lastName + ", " + firstName + "\nZip Code : " + zipCode +
                "\nPhone number : " + phoneNumber);
   }
}
