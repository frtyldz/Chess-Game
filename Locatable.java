

import java.awt.*;
import javax.swing.*;


public interface Locatable
{
  public int getX();
  public int getY();
  public void setPos(int x, int y);
  public boolean moveTo(int x, int y, Board ground);
}