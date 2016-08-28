import java.util.*;
class hunter_72
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String s1[]=str.split(" ");
      str="";
          for(int i=0;i<s1.length;i++)
            {
            if(i%2==0)
            {
               StringBuffer sb=new StringBuffer(s1[i]).reverse();
               s1[i]=sb.toString();
            }
            str+=s1[i]+" ";
            }
            System.out.println(str.trim());
   }
}
