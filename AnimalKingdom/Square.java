
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square
{
   private int sideLength;
   public Square()
   {
      sideLength = 1;
    }
   public Square(int s)
    {
      sideLength = s;
    }

    public String toString()
    {
        return "The side of the square is " + sideLength;
    }

    public boolean equals(Square s)
    {
        return s.sideLength == this.sideLength;
        //return s.sideLength == sideLength;
    }
    
    public void setSideLength(int s)
    {
        sideLength = s;
    }
    public int getSideLength()
    {
        return sideLength;
    }
    
    public double area()
    {
        return sideLength * sideLength;
    }
}