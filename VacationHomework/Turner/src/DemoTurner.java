public class DemoTurner {

    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();

        Turner page = new Page();
        page.turn();

        Pancake pancake = new Pancake();
        pancake.turn();

        Guy guy = new Guy();
        guy.turn();

        Dodon dodon = new Dodon();
        dodon.turn();
    }
}
