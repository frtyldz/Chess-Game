import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;

public class PlayButtons extends JPanel{
  
  int diceNumber = 0;
  int width = 100;
  int column = 100;
  
  public PlayButtons(){  
    JButton b1 = new JButton("DICE");
    ButtonGroup buttonGroup = new ButtonGroup();
    JLabel lab1 = new JLabel(" First Dice: " + diceNumber);
    JLabel lab2 = new JLabel(" Second Dice: " + diceNumber);
    JRadioButton player1 = new JRadioButton("Player 1");
    JRadioButton player2 = new JRadioButton("Player 2");
    buttonGroup.add( player1);
    buttonGroup.add( player2);
    this.add(b1);
    this.add(lab1);
    this.add(player1);
    this.add(player2);
    //this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    this.setSize(width, column);
    this.setVisible(true);
   }
}