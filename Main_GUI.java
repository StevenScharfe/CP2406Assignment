import javax.swing.*;
import java.awt.*;

public class Main_GUI extends JFrame {

    JLabel question = new JLabel("Number of players");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("New Game");
    JLabel greeting = new JLabel("");
    final int WIDTH = 575;
    final int HEIGHT = 525;

    private STGame game;

    PlayerView playerView;
    public static void main(String[] args) {
        Main_GUI frame = new Main_GUI();
        frame.setVisible(true);
    }

    public Main_GUI(){

        super("Hello Frame");
        setSize(WIDTH, HEIGHT);
       // setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question, BorderLayout.NORTH);
        add(answer, BorderLayout.WEST);
        add(pressMe, BorderLayout.SOUTH);
        pressMe.setToolTipText("Not enough info");
        add(greeting, BorderLayout.EAST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pressMe.addActionListener(e -> {

            game = new STGame(5); //dropdown
            game.selectDealer();
            game.balanceCards();
            game.dealRandomCardsToEachPlayer();
            game.selectYouAsPlayer();

            Player humanPlayer = game.getHumanPlayer();

            if (playerView != null){
                remove(playerView);
            }
            playerView = new PlayerView(humanPlayer);

            add(playerView, BorderLayout.CENTER);
            // trigger repaint
            playerView.revalidate();
            System.out.println("Hellooooo");
        });
        //pressMe.addActionListener(new MyActivateButton());
    }
}