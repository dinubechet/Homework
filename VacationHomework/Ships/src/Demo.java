public class Demo {
    public static void main(String[] args) {
        Ship titanic = new CruiseShip("Titanic","1920",2000);
        System.out.println(titanic);

        Ship fedEx = new CargoShip("FedEx","1950",25981);
        System.out.println(fedEx);
    }
}
