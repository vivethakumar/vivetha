import java.util.*;
class player_42
{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      boolean b=false;
      if(n>0)
      {
         int a[]=new int[n];
         for(int i=0;i<n;i++)
              a[i]=s.nextInt();
         for(int i=0;i<n&&(i+1)<n;i++)
         {
            if(a[i]<a[i+1])
            {
               b=true;
            }
            else
            {
            b=false;
            break;
            }
          }
        }
        else
           System.out.println("invalid");
        if(b)
          System.out.println("array is in sorted  order");
        else
           System.out.println("array is not in sorted order");
   }
}
