
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Square
{
  private int sideWidth;
  public Rectangle(int length, int width)
  {
      super(length);
      sideWidth = width;
      
    }
    
  public Rectangle()
  {
      this(1, 2);
    }
    
   public double area()
   {
       return sideWidth * getSideLength();
    }
    
    public int getSideWitdth()
    {
        return sideWidth;
    }
    public int getSideLength()
    {
        return super.getSideLength();
    }
    
    public void setSideWidth(int s)
    {
        sideWidth = s;
    }
    public void setSideLength(int s)
    {
        super.setSideLength(s);;
    }
    public String toString()
    {
        return "Rectangle has sides that are " + sideWidth + " wide and " + super.getSideLength() +  " long";
    }
    public boolean equals(Rectangle s)
       {
           return getSideLength() == s.getSideLength() && sideWidth == s.sideWidth;
}
}
