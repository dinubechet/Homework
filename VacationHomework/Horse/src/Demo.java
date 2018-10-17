public class Demo {
    public static void main(String[] args) {
        Horse customHorse = new Horse("Jorik","Blue",1995);
        System.out.println(customHorse.toString());
        RaceHorse raceHorse = new RaceHorse("Wasea","Green",1995,35);
        System.out.println(raceHorse.toString());

    }
}
