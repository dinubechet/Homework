public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Joe Ambercrombie","Joe@gmail.com",'m');
        Book book = new Book("Blood and Steel",author,100,10);
        System.out.println(book);
    }
}
