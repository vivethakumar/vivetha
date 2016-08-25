import java.util.*;
class hunter_61
{
     public static void main(String args[])
     {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();int min=0;
       if(n>0)
       {
         String a[]=new String[n];
         String str="";
         for(int i=0;i<n;i++)
            {
            a[i]=s.next();
            str+=a[i];
            }
            System.out.println("enter two values to find the distance");
            String a1=s.next();
            String a2=s.next();
         int index1=str.lastIndexOf(a1);
         int index2=str.lastIndexOf(a2);
         if(index1!=-1&&index2!=-1)
            min=Math.abs(index1-index2);
            index1=-1;
            index2=-1;
         for(int i=0;i<n;i++)
         {
             int min1=0;
             index1=str.indexOf(a1,index1+1);
             index2=str.indexOf(a2,index2+1);
             if(index1!=-1&&index2!=-1)
                min1=Math.abs(index1-index2);
              if(min1<min&&min1!=0)
              min=min1;
         }
         System.out.println("min distance("+a1+","+a2+"):"+min);
       }
       else
          System.out.println("invalid");
     }
}
