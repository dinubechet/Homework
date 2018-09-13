public class Billing {
    public static void main(String[] args) {
        Bill(100, 10,100);

    }
    static void Bill(int singlePrice){
        System.out.println("The price at one ordered book + tax is : " + (singlePrice+(singlePrice * 0.08)));
    }


    static void Bill (int singlePrice,int quantity){
        System.out.println("The price for " + quantity + " photo books is " + ((singlePrice*quantity)+((singlePrice*quantity) * 0.08)));
    }

    static void Bill (int singlePrice, int quantity , int couponValue){
        System.out.print("The price for " + quantity + " photo books after the discount from the coupon is ");
        System.out.println(((singlePrice*quantity)-couponValue)+((singlePrice*quantity)-couponValue)*0.08);
    }
}
