public class TestBread {
    public static void main(String[] args) {
        Bread bread1 = new Bread("rye",100.0);
        Bread bread2 = new Bread("brown",60.0);
        Bread bread3 = new Bread("baton",170.0);

        bread1.displayInfo();
        bread2.displayInfo();
        bread3.displayInfo();
    }
}
