import java.util.Random;

public class Card {
    private String suit;
    private int cardValue;
    private int theSwitchMover;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {

        switch(suit) {
            case "s":
                this.suit = "spades";
                break;
            case "h":
                this.suit = "hearts";
                break;
            case "d":
                this.suit = "diamonds";
                break;
            case "c":
                this.suit = "clubs";
                break;
        }
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        if (cardValue <= 13 && cardValue >=1){
            this.cardValue=cardValue;
        }
        else {
            System.out.println("Insert a valid card number, 1 - 13 !");
        }
    }
    public void showInfo(){
        System.out.println("Your card is " + getCardValue() + " of " + getSuit());
    }

}
