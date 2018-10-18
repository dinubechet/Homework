public class NonFiction extends Book {
    private double price;
    public NonFiction(String title ) {
        super(title);
        setPrice();
    }

    @Override
    public double setPrice() {
        this.price = 24.99;
        return this.price;
    }

    @Override
    public String toString() {
        return "NonFiction{" + "Title=" + getTitle() +
                "\nprice=" + price +
                '}';
    }
}
