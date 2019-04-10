public abstract class Piece implements Locatable
{
  protected Player player;
  protected int posX;
  protected int posY;
  
  public Piece(Player player, int x, int y)
  {
    this.player = player;
    posX = x;
    posY = y;
  }
  
  public Player getPlayer()
  {
    return player;
  }
  
  public int getX()
  {
    return posX;
  }
  
  public int getY()
  {
    return posY;
  }
  
  public void setPos(int x, int y)
  {
    posX = x;
    posY = y;
  }
  
  public abstract boolean moveTo(int x, int y, Board ground);
  public abstract String toString();
}