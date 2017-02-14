
/**
 * Write a description of class flipPhone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flipPhone extends CellPhone
{
  private boolean keyboard;
  
  public flipPhone(){
      super();
      keyboard = false;
    }
  
  public flipPhone(String provider, String brand, boolean keyboard){
      super(provider, brand);
      keyboard = false;
    }
  
  public String getProvider(){
      return super.getProvider();
    }
    
  public String getBrand(){
      return super.getBrand();
    }
  
  public boolean getKeyboard(){
      return keyboard;
    }
    
  public void setProvider(String p){
      super.setProvider(p);
    }
    
  public void setBrand(String b){
      super.setBrand(b);
    }
    
  public void setKeyboard(boolean k){
      keyboard = k;
    }
  
  public int getPrice(){
      if(keyboard){
      return super.getPrice() + 100;
    }else{
        return super.getPrice();
    }
    
}
    public String toString()
    {
        return "Flip Phone: " + this.getBrand() + ", " + this.getProvider() + ", " + "Keyboard: " + keyboard;
    }
      
    public boolean equals(flipPhone a)
    {
        return this.equals(a) && keyboard == a.keyboard;
    }
   public String call911(int bribe)
   {
       if (bribe > 50)
        return "Help is on the way!";
       else
        return "Call failed";
    }
}