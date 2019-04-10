public class Player
{
  private int playerNo;
  private String color;
  private boolean isCheck;
  private Piece[] pieces;
  
  public Player(int playerNo)
  {
    this.playerNo = playerNo;
    if (playerNo == 1)
    {
      color = "White";
    }
    else if (playerNo == 2)
    {
      color = "Black";
    }
    isCheck = false;
    pieces = new Piece[16];
  }
  
  public void setIsCheck(boolean checkValue)
  {
    isCheck = checkValue;
  }
  
  public int getPlayerNo()
  {
    return playerNo;
  }
  
  public String getColor()
  {
    return color;
  }
  
  public boolean getIsCheck()
  {
    return isCheck;
  }
  
  public Piece getAPiece(int index)
  {
    return pieces[index];
  }
  
  public void addPiece(Piece piece, int index)
  {
    pieces[index] = piece;
  }
  
  public void removePiece(Piece piece)
  {
    for (int i = 0; i < 16; i++)
    {
      if (pieces[i] == piece)
      {
        pieces[i] = null;
        return;
      }
    }
  }
  
  public String toString()
  {
    if (playerNo == 1)
    {
      return "Player1";
    }
    else
    {
      return "Player2";
    }
  }
}