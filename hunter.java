import java.util.*;
class hunter_63
{
     public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         if(n>0)
         {
           int a[]=new int[n];
           for(int i=0;i<n;i++)
             a[i]=s.nextInt();
          for( int i=0;i<n;i++)
          {
              for(int j=i+1;j<n-1;j++)
              {
                 if(a[i]>=a[j])
                 {
                 a[i]=a[j];
                 }
                 if(a[i]<a[j])
                 {
                 a[i]=a[j];break;
                 }
                
              }
          }
          a[n-2]=a[n-1];
          a[n-1]=0;
          for(int i=0;i<n;i++)
             System.out.print(a[i]+""+(i==n-1?"":" "));
         }
         else
          System.out.println("invalid");
     }
}
