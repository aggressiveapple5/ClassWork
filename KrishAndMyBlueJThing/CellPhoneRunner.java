
/**
 * Write a description of class CellPhoneRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CellPhoneRunner
{
   public static void main(String[] args)
   {
    CellPhone cell = new CellPhone();
   System.out.println(cell);
   smartPhone smart = new smartPhone();
   System.out.println(smart);
   smart.setRetina(true);
   System.out.println(smart);
   smart.setProvider("AT&T");
   System.out.println(smart);
   System.out.println(smart.call911(100));
}
}
