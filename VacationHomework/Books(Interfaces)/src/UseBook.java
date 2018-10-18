public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook1 = new Fiction("Blood and Steel");
        System.out.println(fictionBook1);

        NonFiction nonFictionBook1 = new NonFiction("The couple next door");
        System.out.println(nonFictionBook1);

        BookArray bookStore = new BookArray();
        bookStore.displayBookInfo();
    }
}
