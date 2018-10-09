import java.util.Random;

public class PickTwoCards {
    public static void main(String[] args) {


        Card card1 = new Card();
        Card card2 = new Card();
        Random rand1 = new Random();


        card1.setSuit("s");
        card1.setCardValue(rand1.nextInt(13) + 1);

        card2.setSuit("d");
        card2.setCardValue(rand1.nextInt(13) + 1);

        card1.showInfo();
        card2.showInfo();
    }

}
