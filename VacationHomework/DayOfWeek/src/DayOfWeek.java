import java.util.*;

public class DayOfWeek {
    Scanner scan = new Scanner(System.in);
    String checkDay;
    Day monday = new Day("Monday", "9am-9pm");
    Day tuesday = new Day("Tuesday", "9am-9pm");
    Day wednesday = new Day("Wednesday", "9am-9pm");
    Day thursday = new Day("Thursday", "9am-9pm");
    Day friday = new Day("Friday", "9am-9pm");
    Day saturday = new Day("Saturday", "10am-6pm");
    Day sunday = new Day("Sunday", "11am-5pm");

    Day daysArray[] = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};

    public void askDay(){
        while (checkDay!="ZZZ"){
            System.out.println("Please enter a day to see our schedule for it : ");
            checkDay = scan.nextLine();
            checkDay(checkDay);
        }
    }


    public void checkDay(String day) {

        for (int i = 0 ; i < 7 ; i++){
            if (daysArray[i].getDayOfWeek().equals(day)){
                System.out.println("On " + day + ", working hours are " + daysArray[i].getWorkingHours());
            }

        }
    }


}
