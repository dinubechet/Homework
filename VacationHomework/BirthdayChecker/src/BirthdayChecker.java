import java.util.*;

public class BirthdayChecker {
    private Person[] people = new Person[10];

    public void setPersons() {
        Scanner scanName = new Scanner(System.in);
        Scanner scanDate = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name : ");
            String inputName = scanName.nextLine();
            if (inputName.equals("ZZZ")) {
                break;
            }
            System.out.println("Enter date : ");
            String inputDate = scanDate.nextLine();
            people[i] = new Person(inputName, inputDate);
        }
    }

    private void printPersonsDate(String name) {
        boolean found = false;

        for (Person person : people) {
            if (person == null) {
                break;
            }
            if(person.getName().contains(name)){
                found = true;
                System.out.println(person.getDateOfBirth());
                break;
            }
        }
        if (!found) {
            System.out.println("Person not found");
        }
    }

    public void findName() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name to find : ");
            String name = scan.nextLine();
            if (name.equals("ZZZ")) {
                break;
            }
            printPersonsDate(name);
        }
    }
}
