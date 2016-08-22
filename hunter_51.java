import java.util.*;
class hunter_51
{
   public static void main(String[] args)
   {
   Scanner s=new Scanner(System.in);
   String num1=s.next();
   String num2=s.next();
   if(Integer.parseInt(num1)<0||Integer.parseInt(num2)<0)
   System.out.println("number is negative");
   else
   System.out.println(Integer.parseInt(num1)*Integer.parseInt(num2));
   }
}
