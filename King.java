/**
 * @(#)King.java
 *
 *
 * @author 
 * @version 1.00 2017/12/5
 */


public class King extends Piece{
  protected boolean castling;
  
  public King(Player player, int x, int y) {
    super(player, x, y);
    castling = true;
  }
  
  public boolean moveTo(int x, int y, Board board)
  {
    if((y == 7 && x == 1) && (posX == 1 && posY ==5) && castling)
    {
      if((board.getPiece(1,8) instanceof Rook) && ((board.getPiece(1,8)).getPlayer().getColor().equals(player.getColor())))
      {
        if((!board.isTherePiece(1,6)) && (!board.isTherePiece(1,7)))
        {
          board.movePiece(1,8,1,6);	
          board.movePiece(posX,posY,x,y);
          board.getPiece(1,6).setPos(1,6);
          posX = x;
          posY = y;
          castling = false;
          return true; 
        }
        else
          return false;
      }
    }
    if((x == 1 && y == 2) && (posX == 1 && posY ==5) && castling)
    {
      if((board.getPiece(1,1) instanceof Rook) && ((board.getPiece(1,1)).getPlayer().getColor().equals(player.getColor())))
      {
        if((!board.isTherePiece(1,2)) && (!board.isTherePiece(1,4)) && (!board.isTherePiece(1,3)))
        {
          board.movePiece(1,1,1,3);	
          board.movePiece(posX,posY,x,y);
          board.getPiece(1,3).setPos(1,3);
          posX = x;
          posY = y;
          castling = false;
          return true; 
       }
        else
          return false;
      }
    }
     if((x == 8 && y == 2) && (posX == 8 && posY ==5) && castling)
     {
       if((board.getPiece(8,1) instanceof Rook) && ((board.getPiece(8,1)).getPlayer().getColor().equals(player.getColor())))
       {
       if((!board.isTherePiece(8,2)) && (!board.isTherePiece(8,3)) && (!board.isTherePiece(8,4)))
       {
       		board.movePiece(8,1,8,3);
        	board.movePiece(posX,posY,x,y);
        	board.getPiece(8,3).setPos(8,3);
         	posX = x;
        	posY = y;
        	castling = false;
        	return true; 
       }
       else
        return false;
       }
     }
     if((x == 8 && y == 7) && (posX == 8 && posY ==5) && castling)
     {
       if((board.getPiece(8,8) instanceof Rook) && ((board.getPiece(8,8)).getPlayer().getColor().equals(player.getColor())))
      {
         if((!board.isTherePiece(8,6)) && (!board.isTherePiece(8,7)))
         {
           board.movePiece(8,8,8,6);
           board.movePiece(posX,posY,x,y);
           posX = x;
           posY = y;
           board.getPiece(8,6).setPos(8,6);
           castling = false;
           return true; 
         }
         else
           return false;
       }
     }
     if((x == posX + 1 && y == posY) || (x == posX-1 && y == posY))
     {
       if(!board.isTherePiece(x,y))
       {
         board.movePiece(posX,posY,x,y);
         posX = x;
         posY = y;
         return true; 
       }
       else
       {
         Piece piece = board.getPiece(x,y);
         if(player.getColor().equals(piece.getPlayer().getColor()))
         {
           return false;
         }
         else
         {
           board.getPiece(x, y).getPlayer().removePiece(board.getPiece(x, y));
           board.movePiece(posX,posY,x,y);
           posX = x;
           posY = y;
           return true;
         }
       } 
       
     }
     else if((x == posX && y == posY + 1) || (x == posX && y == posY - 1))
     {
       if(!board.isTherePiece(x,y))
       {
         board.movePiece(posX,posY,x,y);
         posX = x;
         posY = y;
         return true; 
       }
       else
       {
         Piece piece = board.getPiece(x,y);
         if(player.getColor().equals(piece.getPlayer().getColor()))
         {
           return false;
         }
         else
         {
           board.getPiece(x, y).getPlayer().removePiece(board.getPiece(x, y));
           board.movePiece(posX,posY,x,y);
           posX = x;
           posY = y;
           return true;
         }
       } 
     }
     else if((x == posX + 1 && y == posY + 1) || (x == posX + 1 && y == posY - 1))
     {
       if(!board.isTherePiece(x,y))
       {
         board.movePiece(posX,posY,x,y);
         posX = x;
         posY = y;
         return true; 
       }
       else
       {
         Piece piece = board.getPiece(x,y);
         if(player.getColor().equals(piece.getPlayer().getColor()))
         {
           return false;
         }
         else
         {
           board.getPiece(x, y).getPlayer().removePiece(board.getPiece(x, y));
           board.movePiece(posX,posY,x,y);
           posX = x;
           posY = y;
           return true;
         }
       } 
     }
     else if((x == posX - 1 && y == posY + 1) || (x == posX - 1 && y == posY - 1))
     {
       if(!board.isTherePiece(x,y))
       {
         board.movePiece(posX,posY,x,y);
         posX = x;
         posY = y;
         return true; 
       }
       else
       {
         Piece piece = board.getPiece(x,y);
         if(player.getColor().equals(piece.getPlayer().getColor()))
         {
           return false;
         }
         else
         {
           board.getPiece(x, y).getPlayer().removePiece(board.getPiece(x, y));
           board.movePiece(posX,posY,x,y);
           posX = x;
           posY = y;
           return true;
         }
       } 
     }
     return false;
  }
  
  public String toString()
  {
    if (player.getColor().equals("White"))
    {
      return "W/King";
    }
    else
    {
      return "B/King";
    }
  }
}