public class Time
{
  private long time;
  
  public Time()
  {
    time = 0;
  }
  
  public void countTime()
  {
    time = System.currentTimeMillis();
  }
  
  public long getTime()
  {
    return System.currentTimeMillis() - time;
  }
}