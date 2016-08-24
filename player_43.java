import java.util.*;
class player_43
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String x= s.nextLine;
      String y=s.nextLine();
      if(y.length()<=x.length())
      {
      int index=x.indexOf(y,0);
      if(index>-1)
         System.out.println("y is the substring of x");
      else
         System.out.println("y is not a substring of x");
       }
       else
          System.out.println("invalid input");
         
    }
}
