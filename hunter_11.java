import java.util.*;
class hunter_11
{
   public static void main(String[] args[])
   {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       boolean b=true;
       if(str.equalsIgnoreCase("SUNDAY")||str.equalsIgnoreCase("SATURDAY"))
          b=false;
          System.out.println(b);
   }
}
