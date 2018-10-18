public class DemoTurner {

    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();

        Turner page = new Page();
        page.turn();

        Pancake pancake = new Pancake();
        pancake.turn();
    }
}
