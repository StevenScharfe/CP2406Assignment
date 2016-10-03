/**
 * Created by Steven-1 on 2/10/2016.
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>(NUM_CARDS_INIT);
        for (int i = 0; i < NUM_CARDS_INIT; i++){
            cards.add(new Card(i));
        }
    }

    public ArrayList<Card> dealCards(int nCards){
        ArrayList<Card> ret = new ArrayList<Card>();
        for (int i = 0; i < nCards; i++){
            int idx = new Random().nextInt(cards.size());
            Card card = cards.remove(idx);
            ret.add(card);
            System.out.println("card: " + card);
        }
        return ret;
    }
    public void cardBalance(){
        for (Card card : cards){
            card.AssignCardValues();
            //System.out.println(card);
        }
    }

}
