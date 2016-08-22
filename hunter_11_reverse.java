import java.util.*;
class hunter_11_reverse
{
   public static void main()
   {
   Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   String ss[]=str.split(" ");
   if(ss.length>1)
   {
   for(int i=ss.length-1;i>=0;i--)
   {
   System.out.print(ss[i]);
   System.out.print((i==0)?"":" ");
   }
   }
   else
   System.out.println(str);
   }
}
