/**
 * Created by Steven-1 on 2/10/2016.
 */
import java.util.*;

public class STGame {
    private int numPlayers;
    private int dealerId;
    private Player[] players;
    private Deck deck;
    private  static final int NUM_CARDS_TO_DEAL = 8;
    int yourPlayerId;

    private int hardness;
    private int gravity;
    private int cleavage;
    private int abundance;
    private int value;


    public STGame(int numPlayers){
        this.numPlayers = numPlayers;
        deck = new Deck();
    }

    public void selectDealer(){
        //random int
        int i = new Random().nextInt(numPlayers);
        dealerId = i;
    }

    public void dealRandomCardsToEachPlayer(){
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            players[i] = new Player("Player" + i);
        }
        for(Player player : players){
            ArrayList<Card> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }

    public void playGame() {
        boolean gameIsOn = true;
        String choice;
        int cardChoice;
        Scanner input = new Scanner(System.in);
        initialSetTrumpValues();
        while (gameIsOn) {
            // setup players in correct order
            for (int i = 0; i < players.length; i++) {
                // human move
                if (i == yourPlayerId) {
                    System.out.println("Pick a card: \n " + players[i]);
                    choice = input.nextLine();
                    if (choice.equals("exit")) {
                        gameIsOn = false;
                        break;
                    }
                    if (choice.equals("pass")) {
                        players[i].addCard(deck.dealCards(1));
                    }
                    //This card choice chooses the index of the player hand because i couldn't figure out
                    //how to compare the index number with the player choice somehow
                    if (choice.equals("play")) {
                        System.out.println("Card position in hand: ");
                        cardChoice = input.nextInt();
                        chooseCardCategory(players[i][cardChoice]); //how does this work
                        players[i].removeCard(cardChoice);
                    }

                } else {
                    //bot move
                    System.out.println(i);
                }
            }
        }
    }

    public void selectYouAsPlayer() {
        yourPlayerId = new Random().nextInt(players.length);
        //yourPlayerId = 0;
    }

    public Player getHumanPlayer(){
        return players[yourPlayerId];
    }
    public void initialSetTrumpValues(){
        hardness = 0;
        gravity = 0;
        cleavage = 0;
        abundance = 0;
        value = 0;
    }
    public void balanceCards(){
        deck.cardBalance();
    }
    public double chooseCardCategory(Card card){
        System.out.println("Choose Card Category: ");
        Scanner input = new Scanner(System.in);
        return card.getCardCategory(input.nextLine().toUpperCase());
    }
}
