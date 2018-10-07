public class ProductsOfTheIntsInAnArray {

    public int Product(int [] inserNumbers){
        int product = 1;
        for (int numb : inserNumbers){
            product *= numb;
        }
        return product;
    }
}
