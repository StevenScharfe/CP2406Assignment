import java.util.ArrayList;

/**
 * Created by Steven-1 on 2/10/2016.
 */
public class Player {
    private ArrayList<Card> cards;
    private String playerId;

    public Player(String playerId){
        this.playerId = playerId;
    }

    public void setCards(ArrayList<Card> cards){
        this.cards = cards;
    }

    public String toString() {
        return "Player: " + playerId + "\n cards: " + cards;
    }
    public void addCard(ArrayList<Card> card){
        cards.addAll(card);
        //System.out.println(cards);
    }
    public void removeCard(int choice){

        cards.remove(choice);

    }
}
