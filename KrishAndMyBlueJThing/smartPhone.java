
/**
 * Write a description of class smartPhone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class smartPhone extends CellPhone
{
   private boolean retina;
   
   public smartPhone()
   {
       super();
       retina = false;
    }
    
   public smartPhone(String p, String b, boolean r)
   {
       super(p, b);
       retina = r;
    }
    
    
    public String getProvider()
    {
        return super.getProvider();
    }
    
    public String getBrand()
    {
        return super.getBrand();
    }
    
    public boolean getRetina()
    {
        return retina;
    }
    
    public void setProvider(String p)
    {
        super.setProvider(p);
    }
    
    public void setBrand(String b)
    {
        super.setBrand(b);
    }
    
    public void setRetina(boolean r)
    {
        retina = r;
    }
    
    public int getPrice()
    {
        if (retina == true)
            return super.getPrice() + 250;
        else
            return super.getPrice();
        }
    
     public boolean equals(smartPhone a)
     {
         return this.equals(a) && a.retina == retina;
        }
    public String toString()
    {
        return "Smart Phone: " + getBrand() + ", " + getProvider() + ", " + "Retina Display: " + retina;
    }
    
    public String call911(int bribe)
    {
        if (bribe > 50)
            return "Help is on the way!";
        else
            return "Call failed.";
}
}
