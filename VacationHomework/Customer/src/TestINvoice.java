public class TestINvoice {
    public static void main(String[] args) {
        Customer customer = new Customer(3,"Dinu",10);
        Invoice invoice = new Invoice(3,customer,100);
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
