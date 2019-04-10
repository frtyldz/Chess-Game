public class Dice
{
  private int face;
  
  public Dice()
  {
    face = 1;
  }
  
  public void rollDice()
  {
    face = ((int)((Math.random() * 6) + 1));
  }
  
  public int getFace()
  {
    return face;
  }
}