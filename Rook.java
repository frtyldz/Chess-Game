public class Rook extends Piece {
  
  //constructor
  public Rook(Player player, int x, int y)
  {
    super(player, x, y);
  }
  
  public boolean moveTo(int x, int y, Board ground)
  {
    if(x == posX && y > posY)
    {
      for(int i = posY + 1; i < y; i++)
      {
        if(ground.isTherePiece(x,i))
          return false;
      }
      if(ground.isTherePiece(x, y))
      {
        if(player.getColor().equals(ground.getPiece(x,y).getPlayer().getColor()))
        {
          return false;
        }
        else
        {
          ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
          ground.movePiece(posX,posY,x,y);
          posX = x;
          posY = y;
          return true;
        }
      }
      else
      {
        ground.movePiece(posX,posY,x,y);
        posX = x;
        posY = y;
        return true;
      }
    }
    else if(x == posX && y < posY)
    {
      for(int i = posY - 1; i > y; i--)
      {
        if(ground.isTherePiece(x,i))
          return false;
      }
      if(ground.isTherePiece(x, y))
      {
        if(player.getColor().equals(ground.getPiece(x,y).getPlayer().getColor()))
        {
          return false;
        }
        else
        {
          ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
          ground.movePiece(posX,posY,x,y);
          posX = x;
          posY = y;
          return true;
        }
      }
      else
      {
        ground.movePiece(posX,posY,x,y);
        posX = x;
        posY = y;
        return true;
      }
    }
    else if(y == posY && posX > x)
    {
      for(int i = posX - 1; i > x; i--)
      {
        if(ground.isTherePiece(i, y))
          return false;
      }
      if(ground.isTherePiece(x, y))
      {
        if(player.getColor().equals(ground.getPiece(x,y).getPlayer().getColor()))
        {
          return false;
        }
        else
        {
          ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
          ground.movePiece(posX,posY,x,y);
          posX = x;
          posY = y;
          return true;
        }
      }
      else
      {
        ground.movePiece(posX,posY,x,y);
        posX = x;
        posY = y;
        return true;
      }
    }
    else if(y == posY && posX < x)
    {
      for(int i = posX + 1; i < x; i++)
      {
         if(ground.isTherePiece(i, y))
           return false;
      }
      if(ground.isTherePiece(x, y))
      {
        if(player.getColor().equals(ground.getPiece(x,y).getPlayer().getColor()))
        {
          return false;
        }
        else
        {
          ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
          ground.movePiece(posX,posY,x,y);
          posX = x;
          posY = y;
          return true;
        }
      }
      else
      {
        ground.movePiece(posX,posY,x,y);
        posX = x;
        posY = y;
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    if (player.getColor().equals("White"))
    {
      return "W/Rook";
    }
    else
    {
      return "B/Rook";
    }
  }
}
