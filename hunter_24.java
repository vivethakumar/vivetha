import java.util.*;
class hunter_24
{
   public static void main(String[] args)
   {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int count=0;
   if(n>0)
   {
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   a[i]=s.nextInt();
   int target=s.nextInt();
   for(int i=0;i<n;i++)
   {
       for(int j=i+1;j<n;j++)
       {
       if(a[i]+a[j]==target)
       {
       count++;
       System.out.println("numbers are:"+a[i]+" "+a[j]);
       }
       }
   }
   }
   if(count==0)
   System.out.println("no pairs");
   }
}
