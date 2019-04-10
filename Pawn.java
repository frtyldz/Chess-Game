public class Pawn extends Piece
{
  private boolean enPassant;
  
  public Pawn(Player player, int x, int y)
  {
    super(player, x, y);
    
    enPassant = false;
  }
  
  public boolean getEnPassant()
  {
    return enPassant;
  }
  
  public void resetEnPassant()
  {
    enPassant = false;
  }
  
  public boolean moveTo(int x, int y, Board ground)
  {
    if(player.getColor().equals("White"))
    {
      if (x == posX + 1 && y == posY)
      {
        if (ground.isTherePiece(x, y))
        {
          return false;
        }
        else
        {
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          if (x == 8)
          {
            new PromotionFrame(this, ground).setVisible(true);
          }
          return true;
        }
      }
      else if (x == posX + 2 && y == posY && posX == 2)
      {
        if (ground.isTherePiece(x, y) || ground.isTherePiece(x - 1, y))
        {
          return false;
        }
        else
        {
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          enPassant = true;
          return true;
        }
      }
      else if ((y == posY - 1 || y == posY + 1) && x == posX + 1)
      {
        if (ground.getPiece(x - 1, y) instanceof Pawn && ground.getPiece(x - 1, y).getPlayer().getColor().equals("Black") && ((Pawn)ground.getPiece(x - 1, y)).getEnPassant())
        {
          ground.getPiece(x - 1, y).getPlayer().removePiece(ground.getPiece(x - 1, y));
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          ground.removePiece(x - 1, y);
          return true;
        }
        else if (ground.isTherePiece(x, y))
        {
          if (ground.getPiece(x, y).getPlayer().getColor().equals("Black"))
          {
            ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
            ground.movePiece(posX, posY, x, y);
            posX = x;
            posY = y;
            if (x == 8)
            {
              new PromotionFrame(this, ground).setVisible(true);
            }
            return true;
          }
          else
          {
            return false;
          }
        }
      }
    }
    else
    {
      if (x == posX - 1 && y == posY)
      {
        if (ground.isTherePiece(x, y))
        {
          return false;
        }
        else
        {
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          if (x == 1)
          {
            new PromotionFrame(this, ground).setVisible(true);
          }
          return true;
        }
      }
      else if (y == posY && x == posX - 2 && posX == 7)
      {
        if (ground.isTherePiece(x, y) || ground.isTherePiece(x + 1, y))
        {
          return false;
        }
        else
        {
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          enPassant = true;
          return true;
        }
      }
      else if ((y == posY - 1 || y == posY + 1) && x == posX - 1)
      {
        if (ground.getPiece(x + 1, y) instanceof Pawn && ground.getPiece(x + 1, y).getPlayer().getColor().equals("White") && ((Pawn)ground.getPiece(x + 1, y)).getEnPassant())
        {
          ground.getPiece(x + 1, y).getPlayer().removePiece(ground.getPiece(x + 1, y));
          ground.movePiece(posX, posY, x, y);
          posX = x;
          posY = y;
          ground.removePiece(x + 1, y);
          return true;
        }
        else if (ground.isTherePiece(x, y))
        {
          if (ground.getPiece(x, y).getPlayer().getColor().equals("White"))
          {
            ground.getPiece(x, y).getPlayer().removePiece(ground.getPiece(x, y));
            ground.movePiece(posX, posY, x, y);
            posX = x;
            posY = y;
            if (x == 1)
            {
              new PromotionFrame(this, ground).setVisible(true);
            }
            return true;
          }
          else
          {
            return false;
          }
        }
      }
    }
    return false;
  }
  
  public String toString()
  {
    if (player.getColor().equals("White"))
    {
      return "W/Pawn";
    }
    else
    {
      return "B/Pawn";
    }
  }
}