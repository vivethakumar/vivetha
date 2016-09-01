import java.util.*;
class player_148
{
      public static void main(String[] args)
      {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         String str="";
         if(n>0)
         {
         for(int i=0;i<=n;i++)
         {
             if(i%2!=0)
                 str+=String.valueOf(i);
         }
         n=Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(0)));
         for(int i=2;i<str.length();i++)
         {
            int b=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(i%2==0)
               n-=b;
            else
               n+=b;
         }
         System.out.println(n);
         }
         else
            System.out.println("invalid");
      }
}
