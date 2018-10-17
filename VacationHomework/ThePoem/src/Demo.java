public class Demo {
    public static void main(String[] args) {
        Poem poem = new Poem("vo , vo ,vo po lehce",125);
        System.out.println("Poem name : " + poem.getName());
        System.out.println("Lines : " + poem.getNumberOfLines());

        Couplet couplet = new Couplet ("ce seara minunata" );
        System.out.println("Couplet name : " + couplet.getName());
        System.out.println("Lines : " + couplet.getNumberOfLines());

        Limerick limerick = new Limerick("Zarik");
        System.out.println("Limerick name : " + limerick.getName());
        System.out.println("Lines : " + limerick.getNumberOfLines());

        Haiku haiku = new Haiku ( "Smells like teen spirit");
        System.out.println("Haiku name : " + haiku.getName());
        System.out.println("Lines : " + haiku.getNumberOfLines());
    }
}
