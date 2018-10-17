public class RaceHorse extends Horse{

private int noOfRaces;

    public RaceHorse(int noOfRaces) {
        this.noOfRaces = noOfRaces;
    }

    public RaceHorse(String name, String colour, int birthYear, int noOfRaces) {
        super(name, colour, birthYear);
        this.noOfRaces = noOfRaces;
    }

    public int getNoOfRaces() {
        return noOfRaces;
    }

    public void setNoOfRaces(int noOfRaces) {
        this.noOfRaces = noOfRaces;
    }

    @Override
    public String toString() {
        return "RaceHorse{" + getName() + " from " + getBirthYear() + ", with the colour " + getColour() +
                " has a number of races = " + noOfRaces +
                '}';
    }
}
