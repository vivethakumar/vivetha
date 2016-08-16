import java.util.*;
class hunter_11
{
   public static void main(String[] args[])
   {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       boolean b=true,c=false;
       String[] a={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
       for(int i=0;i<a.length;i++)
       {
          if(str.equalsIgnoreCase(a[i]))
              {
                 c=true;
                 break;
              }
       }
       if(c)
       {
       if(str.equalsIgnoreCase("SUNDAY")||str.equalsIgnoreCase("SATURDAY"))
          b=false;
          System.out.println(b);
       }
   }
}
