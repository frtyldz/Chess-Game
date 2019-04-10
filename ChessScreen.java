import java.awt.*;
import javax.swing.*;

public class ChessScreen extends JPanel{
  
  public ChessScreen(){
    /*JButton ne = new JButton("Firat");
    this.setLayout(null);
    ne.setBounds(10, 10, 10, 10);
    add(ne);
    ne.setLocation(100, 100);*/
    this.setLayout(null);
    /*JLabel ne = new JLabel("");
    Image image = new ImageIcon(this.getClass().getResource("images/blackcastle.png")).getImage();
    ne.setIcon(new ImageIcon(image));
    ne.setBounds( 300, 85, 100, 100 );*/
    this.setSize(500,500);
    this.setVisible(true);
  }
  
  public void paint( Graphics g){
    
    /*g.fillRect( 100, 100, 400, 400);
    for( int i = 100; i <= 400; i+= 100){
      for( int j = 100; j <= 400; j+= 100){
        g.clearRect(i, j, 50, 50);
      }
    }*/
    
    /*for( int i = 150; i <= 450; i+= 100){
      for( int j = 150; j <= 450; j+= 100){
        g.clearRect(i, j, 50, 50);
      }
    }*/
    
    for( int i = 0; i < 9; i++){
        g.drawLine(50, i * 60, 530, i * 60);
        g.drawLine(i * 60, 50, i * 60 , 530);
    }  
  }

}