public class Check
{
  public static boolean checkMoves(Player player, Board board, Dice dice1, Dice dice2)                                                                                                                                       
  {
    if (!player.getIsCheck())
    {
      if (dice1.getFace() == 1 || dice2.getFace() == 1 || dice1.getFace() == dice2.getFace())
      {
        for (int i = 0; i < 16; i++)
        {
          if (player.getAPiece(i) instanceof Pawn)
          {
            int x = player.getAPiece(i).getX();
            int y = player.getAPiece(i).getY();
            if(player.getColor().equals("White"))
            {
              if(x<8)
              { 
                if(!board.isTherePiece(x+1,y))
                  return true;
                if(y>1)
                {
                  if(board.isTherePiece(x+1,y-1) && (board.getPiece(x+1,y-1).getPlayer().getColor().equals("Black")))
                    return true;
                }
                if(y<8)
                {
                  if(board.isTherePiece(x+1,y+1) && (board.getPiece(x+1,y+1).getPlayer().getColor().equals("Black")))
                    return true;
                }        
              } 
            }
            if(player.getColor().equals("Black"))
            {
              if(x>1)
              { 
                if(!board.isTherePiece(x-1,y))
                  return true;
                if(y>1)
                {
                  if(board.isTherePiece(x-1,y-1) && (board.getPiece(x-1,y-1).getPlayer().getColor().equals("White")))
                    return true;
                }
                if(y<8)
                {
                  if(board.isTherePiece(x-1,y+1) && !(board.getPiece(x-1,y+1).getPlayer().getColor().equals("White")))
                    return true;
                }        
              }   
            } 
          }
        }
      }
      
      if (dice1.getFace() == 2 || dice2.getFace() == 2 || dice1.getFace() == dice2.getFace())
      {
        for(int i = 0; i<16; i++)
        {
          if(player.getAPiece(i) instanceof Knight)
          {
            int x = player.getAPiece(i).getX();
            int y = player.getAPiece(i).getY();
            if(x > 1 && y >2 )
            {
              if(!board.isTherePiece(x-1,y-2))
                return true;
              else
              {
                if(!board.getPiece(x-1,y-2).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
            if(x <8  && y >2 )
            {
              if(!board.isTherePiece(x+1,y-2))
                return true;
              else
              {
                if(!board.getPiece(x+1,y-2).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
            if(x > 1 && y <7 )
            {
              if(!board.isTherePiece(x-1,y+2))
                return true;
              else
              {
                if(!board.getPiece(x-1,y+2).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
            if(x < 8 && y <7 )
            {
              if(!board.isTherePiece(x+1,y+2))
                return true;
              else
              {
                if(!board.getPiece(x+1,y+2).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x > 2 && y >1 )
            {
              if(!board.isTherePiece(x-2,y-1))
                return true;
              else
              {
                if(!board.getPiece(x-2,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
            if(x >2 && y <8 )
            {
              if(!board.isTherePiece(x-2,y+1))
                return true;
              else
              {
                if(!board.getPiece(x-2,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
            if(x <7 && y >1 )
            {
              if(!board.isTherePiece(x+2,y-1))
                return true;
              else
              {
                if(!board.getPiece(x+2,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x <7 && y<8 )
            {
              if(!board.isTherePiece(x+2,y+1))
                return true;
              else
              {
                if(!board.getPiece(x+2,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true; 
              }
            }
          }
        }
      }
      
      if (dice1.getFace() == 3 || dice2.getFace() == 3 || dice1.getFace() == dice2.getFace())
      {
        for(int i = 0; i<16; i++)
        {
          if (player.getAPiece(i) instanceof Bishop)
          {
            int x = player.getAPiece(i).getX();
            int y = player.getAPiece(i).getY();
            if(x<7 && y<7)
            {
              if(!(board.isTherePiece(x+1,y+1)))
                return true;
              else
              {
                if(!board.getPiece(x+1,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1 && y>1)
            {
              if(!(board.isTherePiece(x-1,y-1)))
                return true;
              else
              {
                if(!board.getPiece(x-1,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x<7 && y>1)
            {
              if(!(board.isTherePiece(x+1,y-1)))
                return true;
              else
              {
                if(!board.getPiece(x+1,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1 && y<7)
            {
              if(!(board.isTherePiece(x-1,y+1)))
                return true;
              else
              {
                if(!board.getPiece(x-1,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
          }
        }
      }
      
      if (dice1.getFace() == 4 || dice2.getFace() == 4 || dice1.getFace() == dice2.getFace())
      {
        for(int i = 0; i<16; i++)
        {
          if (player.getAPiece(i) instanceof Rook)
          {
            int x = player.getAPiece(i).getX();
            int y = player.getAPiece(i).getY();
            if(y<8)
            {
              if(!board.isTherePiece(x,y+1))
                return true;
              else
              {
                if(!board.getPiece(x,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(y>1)
            {
              if(!board.isTherePiece(x,y-1))
                return true;
              else
              {
                if(!board.getPiece(x,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x<8)
            {
              if(!board.isTherePiece(x+1,y))
                return true;
              else
              {
                if(!board.getPiece(x+1,y).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1)
            {
              if(!board.isTherePiece(x-1,y))
                return true;
              else
              {
                if(!board.getPiece(x-1,y).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
          }
        }
      }
      
      if (dice1.getFace() == 5 || dice2.getFace() == 5 || dice1.getFace() == dice2.getFace())
      {
        for(int i = 0; i<16; i++)
        {
          if (player.getAPiece(i) instanceof Queen)
          {
            int x = player.getAPiece(i).getX();
            int y = player.getAPiece(i).getY();
            if(x<7 && y<7)
            {
              if(!(board.isTherePiece(x+1,y+1)))
                return true;
              else
              {
                if(!board.getPiece(x+1,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1 && y>1)
            {
              if(!(board.isTherePiece(x-1,y-1)))
                return true;
              else
              {
                if(!board.getPiece(x-1,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x<7 && y>1)
            {
              if(!(board.isTherePiece(x+1,y-1)))
                return true;
              else
              {
                if(!board.getPiece(x+1,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1 && y<7)
            {
              if(!(board.isTherePiece(x-1,y+1)))
                return true;
              else
              {
                if(!board.getPiece(x-1,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(y<8)
            {
              if(!board.isTherePiece(x,y+1))
                return true;
              else
              {
                if(!board.getPiece(x,y+1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(y>1)
            {
              if(!board.isTherePiece(x,y-1))
                return true;
              else
              {
                if(!board.getPiece(x,y-1).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x<8)
            {
              if(!board.isTherePiece(x+1,y))
                return true;
              else
              {
                if(!board.getPiece(x+1,y).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
            if(x>1)
            {
              if(!board.isTherePiece(x-1,y))
                return true;
              else
              {
                if(!board.getPiece(x-1,y).getPlayer().getColor().equals(player.getColor()))
                  return true;
              }
            }
          }
        }
      }
      
      if (dice1.getFace() == 6 || dice2.getFace() == 6 || dice1.getFace() == dice2.getFace())
      {
        int x = player.getAPiece(15).getX();
        int y = player.getAPiece(15).getY();
        if(x<7 && y<7)
        {
          if(!(board.isTherePiece(x+1,y+1)))
            return true;
          else
          {
            if(!board.getPiece(x+1,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1 && y>1)
        {
          if(!(board.isTherePiece(x-1,y-1)))
            return true;
          else
          {
            if(!board.getPiece(x-1,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x<7 && y>1)
        {
          if(!(board.isTherePiece(x+1,y-1)))
            return true;
          else
          {
            if(!board.getPiece(x+1,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1 && y<7)
        {
          if(!(board.isTherePiece(x-1,y+1)))
            return true;
          else
          {
            if(!board.getPiece(x-1,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(y<8)
        {
          if(!board.isTherePiece(x,y+1))
            return true;
          else
          {
            if(!board.getPiece(x,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(y>1)
        {
          if(!board.isTherePiece(x,y-1))
            return true;
          else
          {
            if(!board.getPiece(x,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x<8)
        {
          if(!board.isTherePiece(x+1,y))
            return true;
          else
          {
            if(!board.getPiece(x+1,y).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1)
        {
          if(!board.isTherePiece(x-1,y))
            return true;
          else
          {
            if(!board.getPiece(x-1,y).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
      }
      return false;
    }
    else
    {
      if (dice1.getFace() == 6 || dice2.getFace() == 6 || dice1.getFace() == dice2.getFace())
      {
        int x = player.getAPiece(15).getX();
        int y = player.getAPiece(15).getY();
        if(x<7 && y<7)
        {
          if(!(board.isTherePiece(x+1,y+1)))
            return true;
          else
          {
            if(!board.getPiece(x+1,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1 && y>1)
        {
          if(!(board.isTherePiece(x-1,y-1)))
            return true;
          else
          {
            if(!board.getPiece(x-1,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x<7 && y>1)
        {
          if(!(board.isTherePiece(x+1,y-1)))
            return true;
          else
          {
            if(!board.getPiece(x+1,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1 && y<7)
        {
          if(!(board.isTherePiece(x-1,y+1)))
            return true;
          else
          {
            if(!board.getPiece(x-1,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(y<8)
        {
          if(!board.isTherePiece(x,y+1))
            return true;
          else
          {
            if(!board.getPiece(x,y+1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(y>1)
        {
          if(!board.isTherePiece(x,y-1))
            return true;
          else
          {
            if(!board.getPiece(x,y-1).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x<8)
        {
          if(!board.isTherePiece(x+1,y))
            return true;
          else
          {
            if(!board.getPiece(x+1,y).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
        if(x>1)
        {
          if(!board.isTherePiece(x-1,y))
            return true;
          else
          {
            if(!board.getPiece(x-1,y).getPlayer().getColor().equals(player.getColor()))
              return true;
          }
        }
      }
      else
      {
        Player player2;
        if(player.getColor().equals("White"))
        {
          player2 = new Player(2);
        }
        else
          player2 = new Player(1);
        Piece[] arr;
        arr = getThreateningPieces(player, board, player.getAPiece(15));
        if (dice1.getFace() == 1 || dice2.getFace() == 1 || dice1.getFace() == dice2.getFace())
        {
          for(int i = 0; i<arr.length; i++)
          {
            Piece[] arr2;
            arr2 = getThreateningPieces(player2, board, player.getAPiece(15));
            for(int j = 0; j<arr2.length; j++)
            {
              if(arr2[j] instanceof Pawn)
                return true;
            } 
          }
        }
        if (dice1.getFace() == 2 || dice2.getFace() == 2 || dice1.getFace() == dice2.getFace())
        {
          for(int i = 0; i<arr.length; i++)
          {
            Piece[] arr2;
            arr2 = getThreateningPieces(player2, board, player.getAPiece(15));
            for(int j = 0; j<arr2.length; j++)
            {
              if(arr2[j] instanceof Knight)
                return true;
            } 
          }
        }
        if (dice1.getFace() == 3 || dice2.getFace() == 3 || dice1.getFace() == dice2.getFace())
        {
          for(int i = 0; i<arr.length; i++)
          {
            Piece[] arr2;
            arr2 = getThreateningPieces(player2, board, player.getAPiece(15));
            for(int j = 0; j<arr2.length; j++)
            {
              if(arr2[j] instanceof Bishop)
                return true;
            } 
          }
        }
        if (dice1.getFace() == 4 || dice2.getFace() == 4 || dice1.getFace() == dice2.getFace())
        {
          for(int i = 0; i<arr.length; i++)
          {
            Piece[] arr2;
            arr2 = getThreateningPieces(player2, board, player.getAPiece(15));
            for(int j = 0; j<arr2.length; j++)
            {
              if(arr2[j] instanceof Rook)
                return true;
            } 
          }
        }
        if (dice1.getFace() == 5 || dice2.getFace() == 5 || dice1.getFace() == dice2.getFace())
        {
          for(int i = 0; i<arr.length; i++)
          {
            Piece[] arr2;
            arr2 = getThreateningPieces(player2, board, player.getAPiece(15));
            for(int j = 0; j<arr2.length; j++)
            {
              if(arr2[j] instanceof Queen)
                return true;
            } 
          }
        }
      }
    }
    return false;
  }
  //////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////
  public static boolean checkChecks(Player player, Board board)
  {
    if (checkThreats(player, board, player.getAPiece(15)))
    {
      player.setIsCheck(true);
      return true;
    }
    else
    {
      player.setIsCheck(false);
      return false;
    }
  }
  /////////////////////////////////////////
  //////////////////////////////////////
  //////////////////////////////////////
  ///////////////////////////////////////////
  //////////////////////////////////////////
  ///////////////////////////////////////////
  public static boolean checkThreats(Player player, Board board, Piece piece)
  {
    int x = piece.getX();
    int y = piece.getY();
    if(y<8) 
    {
      boolean flag = true;   
      for(int i = y+1; i<=8 && flag; i++)
      {
        if(board.isTherePiece(x,i))
        {
          if(i==y+1 && (board.getPiece(x,i) instanceof King))
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false; 
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false; 
          }
        }
      }
    }
    if(y>1)
    { 
      boolean flag = true; 
      for(int i = y-1; i>0 && flag; i--)
      {
        if(board.isTherePiece(x,i))
        {
          if(i==y-1 && board.getPiece(x,i) instanceof King)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
        }
      }
    }
    if(x<8)
    { 
      boolean flag = true; 
      for(int i = x+1; i<=8 && flag; i++)
      {
        if(board.isTherePiece(i,y))
        {
          if(i==x+1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
        }
      }
    }
    if(x>1)
    { 
      boolean flag = true;   
      for(int i = x-1; i>0; i--)
      {
        if(board.isTherePiece(i,y) && flag)
        {
          if(i==x-1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
        }
      }
    }
    if(x<8 && y<8)
    {
      boolean flag = true; 
      for(int i = x+1; i<=8 && flag; i++)
      {
        for(int j = y+1; j<= 8 && flag; j++)
        {
          if(i-j == x-y && board.isTherePiece(i,j))
          {
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("Black") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop || board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;   
            } 
          }
        }
      }
    }
    if(x>1 && y<8)
    {
      boolean flag = true; 
      for(int i = x-1; i>0 && flag; i--)
      {
        for(int j = y+1; j<= 8 && flag; j++)
        {
          if(i+j == x+y && board.isTherePiece(i,j))
          {
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;  
            }
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("White") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
          } 
        }
      }
    }
    if(x>1 && y>1)
    {
      boolean flag = true;
      for(int i = x-1; i>0 && flag; i--)
      {
        for(int j = y-1; j> 0 && flag; j--)
        {
          if(i-j == x-y && board.isTherePiece(i,j))
          {
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;
            }
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("White") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false; 
            } 
          }
        }
      }
    }
    if(x<8 && y>1)
    {
      boolean flag = true;
      for(int i = x+1; i<=8 && flag; i++)
      {
        for(int j = y-1; j> 8 && flag; j--)
        {
          if(i+j == x+y && board.isTherePiece(i,j))
          {
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;  
            }
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("Black") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true; 
            } 
          }
        }
      }
    }
    if(x > 1 && y >2 )
    {
      if(board.getPiece(x-1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y-2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x <8  && y >2 )
    {
      if(board.getPiece(x+1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y-2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x > 1 && y <7 )
    {
      if(board.getPiece(x-1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y+2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x < 8 && y <7 )
    {
      if(board.getPiece(x+1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y+2).getPlayer().getColor().equals(player.getColor()))
          return true;
      }
    }
    if(x > 2 && y >1 )
    {
      if(board.getPiece(x-2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y-1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x >2 && y <8 )
    {
      if(board.getPiece(x-2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y+1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x <7 && y >1 )
    {
      if(board.getPiece(x+2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y-1).getPlayer().getColor().equals(player.getColor()))
          return true;
      }
    }
    if(x <7 && y<8 )
    {
      if(board.getPiece(x+2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y+1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    return false;
  }
  ////////////////////////////////////////////////
  /////////////////////////////////////////////////
  ////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////
  public static boolean checkThreats(Player player, Board board, int x, int y)
  {
    if(y<8) 
    {
      boolean flag = true;   
      for(int i = y+1; i<=8; i++)
      {
        if(board.isTherePiece(x,i) && flag)
        {
          if(i==y+1 && board.getPiece(x,i) instanceof King)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false; 
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false; 
          }
        }
      }
    }
    if(y>1)
    { 
      boolean flag = true; 
      for(int i = y-1; i>0; i--)
      {
        if(board.isTherePiece(x,i) && flag)
        {
          if(i==y-1 && board.getPiece(x,i) instanceof King)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
        }
      }
    }
    if(x<8)
    { 
      boolean flag = true; 
      for(int i = x+1; i<=8; i++)
      {
        if(board.isTherePiece(i,y) && flag)
        {
          if(i==x+1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
        }
      }
    }
    if(x>1)
    { 
      boolean flag = true;   
      for(int i = x-1; i>0; i--)
      {
        if(board.isTherePiece(i,y) && flag)
        {
          if(i==x-1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else
              flag = false;  
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
              return true;
            else 
              flag = false;  
          }
        }
      }
    }
    if(x<8 && y<8)
    {
      boolean flag = true; 
      for(int i = x+1; i<=8;i++)
      {
        for(int j = y+1; j<= 8; j++)
        {
          if(i-j == x-y && board.isTherePiece(i,j) && flag)
          {
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("Black") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop || board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;   
            } 
          }
        }
      }
    }
    if(x>1 && y<8)
    {
      boolean flag = true; 
      for(int i = x-1; i>0;i--)
      {
        for(int j = y+1; j<= 8; j++)
        {
          if(i+j == x+y && board.isTherePiece(i,j) && flag)
          {
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;  
            }
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("White") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
          } 
        }
      }
    }
    if(x>1 && y>1)
    {
      boolean flag = true;
      for(int i = x-1; i>0;i--)
      {
        for(int j = y-1; j> 0; j--)
        {
          if(i-j == x-y && board.isTherePiece(i,j) && flag)
          {
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;
            }
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("White") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false; 
            } 
          }
        }
      }
    }
    if(x<8 && y>1)
    {
      boolean flag = true;
      for(int i = x+1; i<=8;i++)
      {
        for(int j = y-1; j> 8; j--)
        {
          if(i+j == x+y && board.isTherePiece(i,j) && flag)
          {
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else 
                flag = false;  
            }
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(board.getPiece(i,j).getPlayer().getColor().equals("Black") && !board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true;
              else
                flag = false;  
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
                return true; 
            } 
          }
        }
      }
    }
    if(x > 1 && y >2 )
    {
      if(board.getPiece(x-1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y-2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x <8  && y >2 )
    {
      if(board.getPiece(x+1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y-2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x > 1 && y <7 )
    {
      if(board.getPiece(x-1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y+2).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x < 8 && y <7 )
    {
      if(board.getPiece(x+1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y+2).getPlayer().getColor().equals(player.getColor()))
          return true;
      }
    }
    if(x > 2 && y >1 )
    {
      if(board.getPiece(x-2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y-1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x >2 && y <8 )
    {
      if(board.getPiece(x-2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y+1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    if(x <7 && y >1 )
    {
      if(board.getPiece(x+2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y-1).getPlayer().getColor().equals(player.getColor()))
          return true;
      }
    }
    if(x <7 && y<8 )
    {
      if(board.getPiece(x+2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y+1).getPlayer().getColor().equals(player.getColor()))
          return true; 
      }
    }
    return false;
  }
  /////////////////////////////////////////////////////
  ////////////////////////////////////////////////////
  /////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////
  public static Piece[] getThreateningPieces(Player player, Board board, Piece piece)
  {
    Piece[] pieces = new Piece[16];
    int count = 0;
    int x = piece.getX();
    int y = piece.getY();
    if(y<8)
    {
      boolean finish = false;
      for(int i = y+1; i<=8 && !finish; i++)
      {
        if(board.isTherePiece(x,i))
        {
          if(i==y+1 && board.getPiece(x,i) instanceof King)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(x,i);
              count++;
            }
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(x,i);
              count++;
            }
          }
          finish = true;
        }
      }
    }
    if(y>1)
    { 
      boolean finish = false;
      for(int i = y-1; i>0 &&!finish; i--)
      {
        if(board.isTherePiece(x,i))
        {
          if(i==y-1 && board.getPiece(x,i) instanceof King)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(x,i);
              count++;
            }
          }
          if(board.getPiece(x,i) instanceof Rook || board.getPiece(x,i) instanceof Queen)
          {
            if(!board.getPiece(x,i).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(x,i);
              count++;
            }
          }
          finish = true;
        }
      }
    }
    if(x<8)
    {
      boolean finish = false;
      for(int i = x+1; i<=8 && !finish; i++)
      {
        if(board.isTherePiece(i,y))
        {
          if(i==x+1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(i,y);
              count++;
            }
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(i,y);
              count++;
            }
          }
          finish = true;
        }
      }
    }
    if(x>1)
    { 
      boolean finish = false;
      for(int i = x-1; i>0 && !finish; i--)
      {
        if(board.isTherePiece(i,y))
        {
          if(i==x-1 && board.getPiece(i,y) instanceof King)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(i,y);
              count++;
            }
          }
          if(board.getPiece(i,y) instanceof Rook || board.getPiece(i,y) instanceof Queen)
          {
            if(!board.getPiece(i,y).getPlayer().getColor().equals(player.getColor()))
            {
              pieces[count] = board.getPiece(i,y);
              count++;
            }
          }
          finish = true;
        }
      }
    }
    if(x<8 && y<8)
    {
      boolean finish = false;
      for(int i = x+1; i<=8 && !finish; i++)
      {
        for(int j = y+1; j<= 8 && !finish; j++)
        {
          if(i-j == x-y && board.isTherePiece(i,j))
          {
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(i==x+1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()) && board.getPiece(i,j).getPlayer().getColor().equals("Black"))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            finish = true;
          }
        }
      }
    }
    if(x>1 && y<8)
    {
      boolean finish = false;
      for(int i = x-1; i>0 && !finish; i--)
      {
        for(int j = y+1; j<= 8 && !finish; j++)
        {
          if(i+j == x+y && board.isTherePiece(i,j))
          {
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(i==x-1 && j==y+1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()) && board.getPiece(i,j).getPlayer().getColor().equals("White"))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              } 
            }
            finish = true;
          }
        }
      }
    }
    if(x>1 && y>1)
    {
      boolean finish = false;
      for(int i = x-1; i>0 && !finish;i--)
      {
        for(int j = y-1; j> 0 && !finish; j--)
        {
          if(i-j == x-y && board.isTherePiece(i,j))
          {
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(i==x-1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()) && board.getPiece(i,j).getPlayer().getColor().equals("White"))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            finish = true;
          }
        }
      }
    }
    if(x<8 && y>1)
    {
      boolean finish = false; 
      for(int i = x+1; i<=8 && !finish;i++)
      {
        for(int j = y-1; j> 0 && !finish; j--)
        {
          if(i+j == x+y && board.isTherePiece(i,j))
          {
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof King)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(i==x+1 && j==y-1 && board.getPiece(i,j) instanceof Pawn)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()) && board.getPiece(i,j).getPlayer().getColor().equals("Black"))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              }
            }
            if(board.getPiece(i,j) instanceof Bishop && board.getPiece(i,j) instanceof Queen)
            {
              if(!board.getPiece(i,j).getPlayer().getColor().equals(player.getColor()))
              {
                pieces[count] = board.getPiece(i,j);
                count++;
              } 
            }
            finish = true;
          }
        }
      }
    }
    if(x > 1 && y >2 )
    {
      if(board.getPiece(x-1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y-2).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x-1,y-2);
          count++;
        } 
      }
    }
    if(x <8  && y >2 )
    {
      if(board.getPiece(x+1,y-2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y-2).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x+1,y-2);
          count++;
        } 
      }
    }
    if(x > 1 && y <7 )
    {
      if(board.getPiece(x-1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x-1,y+2).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x-1,y+2);
          count++;
        }
      }
    }
    if(x < 8 && y <7 )
    {
      if(board.getPiece(x+1,y+2) instanceof Knight)
      {
        if(!board.getPiece(x+1,y+2).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x+1,y+2);
          count++;
        }
      }
    }
    if(x > 2 && y >1 )
    {
      if(board.getPiece(x-2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y-1).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x-2,y-1);
          count++;
        } 
      }
    }
    if(x >2 && y <8 )
    {
      if(board.getPiece(x-2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x-2,y+1).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x-2,y+1);
          count++;
        } 
      }
    }
    if(x <7 && y >1 )
    {
      if(board.getPiece(x+2,y-1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y-1).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x+2,y-1);
          count++;
        }
      }
    }
    if(x <7 && y<8 )
    {
      if(board.getPiece(x+2,y+1) instanceof Knight)
      {
        if(!board.getPiece(x+2,y+1).getPlayer().getColor().equals(player.getColor()))
        {
          pieces[count] = board.getPiece(x+2,y+1);
          count++;
        } 
      }
    }
    return pieces;
  }
}