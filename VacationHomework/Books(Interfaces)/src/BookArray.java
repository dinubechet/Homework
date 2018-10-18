

public class BookArray {

    Fiction fictionBook1 = new Fiction("Blood and Steel");
    Fiction fictionBook2 = new Fiction("Half a king");
    Fiction fictionBook3 = new Fiction("Half a kingdom");
    Fiction fictionBook4 = new Fiction("Half a prince");
    Fiction fictionBook5 = new Fiction("Da Vinci's Code");

    NonFiction nonFictionBook1 = new NonFiction("The couple next door");
    NonFiction nonFictionBook2 = new NonFiction("The girl on the train");
    NonFiction nonFictionBook3 = new NonFiction("Me before you");
    NonFiction nonFictionBook4 = new NonFiction("NonFic 4");
    NonFiction nonFictionBook5 = new NonFiction("NonFic 5");

    Book [] bookstore = {fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5,nonFictionBook1,nonFictionBook2,
    nonFictionBook3,nonFictionBook4,nonFictionBook5};

    public void displayBookInfo(){
        for (int i = 0 ; i < bookstore.length ; i++){
            System.out.println(bookstore[i].toString());
            // System.out.println("Title : " + bookstore[i].getTitle() + "\nPrice : " + bookstore[i].getPrice());
        }
    }
}
