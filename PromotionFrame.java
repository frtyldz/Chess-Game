import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class PromotionFrame extends JFrame
{
  Piece piece;
  Board ground;
  JPanel panel;
  JLabel label;
  JButton rookButton;
  JButton queenButton;
  JButton bishopButton;
  JButton knightButton;
  
  
  //Contructor
  public PromotionFrame(Piece piece, Board ground)
  {
    this.piece = piece;
    this.ground = ground;
    setSize(515,250);
    setLocation(710, 290);
    setLayout(null);
    setTitle("Promotion!");
    
    panel = new JPanel();
    label = new JLabel("Please select a Piece to promote from Pawn.");
    queenButton = new JButton("QUEEN");
    rookButton = new JButton("ROOK");
    bishopButton = new JButton("BISHOP");
    knightButton = new JButton("KNIGHT");
    ActionListener listener1 = new ClickListenerQueen();
    queenButton.addActionListener(listener1);
    ActionListener listener2 = new ClickListenerRook();
    rookButton.addActionListener(listener2);
    ActionListener listener3 = new ClickListenerBishop();
    bishopButton.addActionListener(listener3);
    ActionListener listener4 = new ClickListenerKnight();
    knightButton.addActionListener(listener4);
    
    panel.setBounds(0, 0, 500, 200);
    
    panel.setLayout(null);
    
    label.setBounds(125, 25, 275, 50);
    queenButton.setBounds(20, 100, 85, 50);
    rookButton.setBounds(145, 100, 85, 50);
    bishopButton.setBounds(270, 100, 85, 50);
    knightButton.setBounds(395, 100, 85, 50);
    
    panel.add(label);
    panel.add(queenButton);
    panel.add(rookButton);
    panel.add(bishopButton);
    panel.add(knightButton);
    
    add(panel);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  
  class ClickListenerQueen implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      int x = piece.getX();
      int y = piece.getY();
      ground.removePiece(x,y);
      piece.getPlayer().removePiece(piece);
      
      for(int i = 0; i <= 7; i++)
      {
        if(piece.getPlayer().getAPiece(i) == null)
        {
          piece.getPlayer().addPiece(new Queen(piece.getPlayer(), x, y), i);
          ground.addPiece(piece.getPlayer().getAPiece(i),x,y);
          dispose();
          return;
        }
      }
    }
  }
  
  class ClickListenerRook implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      int x = piece.getX();
      int y = piece.getY();
      ground.removePiece(x,y);
      piece.getPlayer().removePiece(piece);
      
      for(int i = 0; i <= 7; i++)
      {
        if(piece.getPlayer().getAPiece(i) == null)
        {
          piece.getPlayer().addPiece(new Rook(piece.getPlayer(), x, y), i);
          ground.addPiece(piece.getPlayer().getAPiece(i),x,y);
          dispose();
          return;
        }
      }
    }
  }
  
  class ClickListenerBishop implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      int x = piece.getX();
      int y = piece.getY();
      ground.removePiece(x,y);
      piece.getPlayer().removePiece(piece);
      
      for(int i = 0; i <= 7; i++)
      {
        if(piece.getPlayer().getAPiece(i) == null)
        {
          piece.getPlayer().addPiece(new Bishop(piece.getPlayer(), x, y), i);
          ground.addPiece(piece.getPlayer().getAPiece(i),x,y);
          dispose();
          return;
        }
      }
    }
  }
  
  class ClickListenerKnight implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      int x = piece.getX();
      int y = piece.getY();
      ground.removePiece(x,y);
      piece.getPlayer().removePiece(piece);
      
      for(int i = 0; i <= 7; i++)
      {
        if(piece.getPlayer().getAPiece(i) == null)
        {
          piece.getPlayer().addPiece(new Knight(piece.getPlayer(), x, y), i);
          ground.addPiece(piece.getPlayer().getAPiece(i),x,y);
          dispose();
          return;
        }
      }
    }
  } 
}