public class CargoShip extends Ship {

    private int cargoCapacity;

    public CargoShip(String shipName, String yearOfCreation, int cargoCapacity) {
        super(shipName, yearOfCreation);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public String toString() {
        return "CargoShip{" +
                "\nshipName=" + getShipName() +
                "\ncargoCapacity=" + cargoCapacity +
                '}';
    }
}
