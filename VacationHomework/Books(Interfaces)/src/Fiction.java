public class Fiction extends Book {

    private double price;
    public Fiction(String title ) {
        super(title);
        setPrice();
    }

    @Override
    public double setPrice() {
        this.price = 37.99;
        return this.price;
    }

    @Override
    public String toString() {
        return "Fiction{" + "Title=" + getTitle() +
                "\nprice=" + price +
                '}';
    }
}
