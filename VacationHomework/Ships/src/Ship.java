public class Ship {

    private String shipName;
    private String yearOfCreation;

    public Ship(String shipName, String yearOfCreation) {
        this.shipName = shipName;
        this.yearOfCreation = yearOfCreation;
    }


    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", yearOfCreation='" + yearOfCreation + '\'' +
                '}';
    }
}
