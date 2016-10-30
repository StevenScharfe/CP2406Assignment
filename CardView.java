import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class CardView extends JPanel {
    Card card;
    JLabel cardName;
    public CardView(Card card){
        this.card = card;
        cardName = new JLabel(card.toString());
        add(cardName);
//        ImageIcon image = new ImageIcon("C:\\Users\\Steven\\IdeaProjects\\Assignment2\\src\\images\\Slide01");
//        JLabel imageLabel = new JLabel(image);
//        add(imageLabel);
//        imageLabel.setVisible(true);

        addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                STGame.currentGame.validCardToPlay(card);
                cardName.setText("I WAS CLICKED");
            }
        });
    }

}
