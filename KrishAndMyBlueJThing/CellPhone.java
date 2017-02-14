
/**
 * Write a description of class CellPhones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CellPhone
{
  private String provider;
  private String brand;
    public CellPhone(String p, String b)
   {
       provider = p;
       brand = b;
   }
    
   public CellPhone()
    {
        provider = "Verizon";
        brand = "Apple";
    }
    
    public String getProvider()
    {
        return provider;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setProvider(String p)
    {
        provider = p;
    }
    
    public void setBrand(String b)
    {
        brand = b;
    }
    
    public int getPrice()
    {
        int price = 0;
        if (brand.equalsIgnoreCase("Apple"))
            price += 600;
        else
            price += 500;
            
         if(brand.equalsIgnoreCase("Verizon"))
            price += 100;
         else
            price += 75;
       return price;
    }
    
    public boolean equals(CellPhone a)
    {
        return provider == a.provider && brand == a.brand;
     
    }
    
    public String toString()
    {
        return "CellPhone: " + brand + ", " + provider;
    }
    
    public String call911()
    {
        return "911 Call Failed";
    }
}
