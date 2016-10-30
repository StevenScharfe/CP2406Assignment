/**
 * Created by Steven-1 on 2/10/2016.
 */

import java.nio.channels.Pipe;
import java.util.*;

public class Main_dos {

    private static final int NEW_GAME = 1;

    public static void main(String[] args) {

        showWelcome();
        //showMenu();
        int opt = getUserMenuChoice();
        STGame game;
        if (opt == NEW_GAME) {
            game = startNewGame();
            game.playGame();
        }
    }

    private static STGame startNewGame(){
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.balanceCards();
        game.dealRandomCardsToEachPlayer();
        game.selectYouAsPlayer();
        Player humanPlayer = game.getHumanPlayer();
        //showPlayer(humanPlayer);

        //game.playGame();
        //game.showHumanPlayerCards();
        return game;
    }
    private static int getNumPlayers(){

        Scanner input = new Scanner(System.in);
        System.out.println("How many Players? ");

        return input.nextInt();
    }

    private static int getUserMenuChoice(){
        return 1;
    }

    private static void showMenu(){
        System.out.println("1. Start game");
        System.out.println("2. exit");
    }

    private static void showWelcome(){
        System.out.println("Hello");

    }
    private static void showPlayer(Player humanPlayer){
        System.out.println("Human Player: " + humanPlayer);
    }
}
