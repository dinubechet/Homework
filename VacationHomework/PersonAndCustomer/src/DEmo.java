public class DEmo {
    public static void main(String[] args) {
        Person jorik = new Customer("Jorik","n/a","123456789",1,true);
        System.out.println(jorik.toString());

        PrefferedCustomer wasea = new PrefferedCustomer("wasea","N/A","2346546",2,true,1001);
        System.out.println(wasea.toString());
        System.out.println(wasea.applyDiscount());

    }
}
