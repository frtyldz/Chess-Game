public class Board 
{
  private Locatable[][] squares;
    
  public Board()
  {
    squares = new Locatable[8][8];
  }
  
  public void addPiece(Piece piece, int x, int y)
  {
    squares[x - 1][y - 1] = piece;
  }
  
  public boolean isTherePiece(int x, int y)
  {
    if (squares[x - 1][y - 1] != null)
    {
      return true;
    }
    return false;
  }
  
  public Piece getPiece(int x, int y)
  {
    return (Piece)squares[x - 1][y - 1];
  }
  
  public void movePiece(int fromX, int fromY, int toX, int toY)
  {
    squares[toX - 1][toY - 1] = squares[fromX - 1][fromY - 1];
    squares[fromX - 1][fromY - 1] = null;
  }
  
  public void removePiece(int x, int y)
  {
    squares[x - 1][y - 1] = null;
  }
  
  public String toString()
  {
    String result = "";
    for (int k = 8; k > 0; k--)
    {
      for (int l = 1; l < 9; l++)
      {
        result += this.getPiece(k,l) + "\t";
      }
      result += "\n";
    }
    return result;
  }
}