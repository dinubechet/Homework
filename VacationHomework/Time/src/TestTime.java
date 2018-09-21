public class TestTime {
    public static void main(String[] args) {
        Time time = new Time(15,59  ,59);
        System.out.println(time);
        time.nextSecond();
        System.out.println(time);

        Time time2 = new Time(0,0  ,0);
        System.out.println(time2);
        time2.previousSecond();
        System.out.println(time2);
        time2.nextSecond();
        System.out.println(time2);



    }
}
