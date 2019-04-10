public class TestGame
{
  public static void main(String[] args)
  {
    Board ground = new Board();
    Player player1 = new Player(1);
    player1.addPiece(new Pawn(player1, 2, 3), 0);
    ground.addPiece(player1.getAPiece(0), player1.getAPiece(0).getX(), player1.getAPiece(0).getY());
    player1.addPiece(new Pawn(player1, 6, 8), 1);
    ground.addPiece(player1.getAPiece(1), player1.getAPiece(1).getX(), player1.getAPiece(1).getY());
    player1.addPiece(new Pawn(player1, 4, 2), 2);
    ground.addPiece(player1.getAPiece(2), player1.getAPiece(2).getX(), player1.getAPiece(2).getY());
    player1.addPiece(new King(player1, 3, 7), 3);
    ground.addPiece(player1.getAPiece(3), player1.getAPiece(3).getX(), player1.getAPiece(3).getY());
    player1.addPiece(new Queen(player1, 5, 6), 4);
    ground.addPiece(player1.getAPiece(4), player1.getAPiece(4).getX(), player1.getAPiece(4).getY());
    
    Player player2 = new Player(2);
    player2.addPiece(new Pawn(player2, 2, 2), 0);
    ground.addPiece(player2.getAPiece(0), player2.getAPiece(0).getX(), player2.getAPiece(0).getY());
    player2.addPiece(new Pawn(player2, 6, 6), 1);
    ground.addPiece(player2.getAPiece(1), player2.getAPiece(1).getX(), player2.getAPiece(1).getY());
    player2.addPiece(new Pawn(player2, 3, 4), 2);
    ground.addPiece(player2.getAPiece(2), player2.getAPiece(2).getX(), player2.getAPiece(2).getY());
    player2.addPiece(new Pawn(player2, 4, 7), 3);
    ground.addPiece(player2.getAPiece(3), player2.getAPiece(3).getX(), player2.getAPiece(3).getY());
    
    System.out.println(ground);
    
    if (player1.getAPiece(0).moveTo(3, 4, ground))
    {
      System.out.println("\nMovement is legal\n");
    }
    else
    {
      System.out.println("\nMovement is not legal\n");
    }
    
    System.out.println(ground);
    
    if (player2.getAPiece(3).moveTo(4, 5, ground))
    {
      System.out.println("\nMovement is legal\n");
    }
    else
    {
      System.out.println("\nMovement is not legal\n");
    }
    
    System.out.println(ground);
  }
}