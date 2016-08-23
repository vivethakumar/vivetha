import java.util.*;
class pro_37
{
   public static void main(String args[])
   {
      ArrayList<Long> prime=new ArrayList<Long>();
      ArrayList<Long> p1=new ArrayList<Long>();
      ArrayList<Long> p2=new ArrayList<Long>();
      long sum=0;
      for(long i=2;i<100;i++)
      {
         boolean b1=true;
         for(long j=2;j<i;j++)
         {
            if(i%j==0)
            {
              b1=false;break;
            }
         }
         if(b1)
         {
            sum=i;
            if(sum>9)
            {
                sum=0;
                long num=i;
                while(num!=0)
                {
                  sum+=num%10;
                  num=num/10;
                }
            }
         if(sum>=100)
         break;
         else
         {
            if(!prime.contains(sum))
            {
               prime.add(sum);
               p1.add(i);
            }
            else
            p2.add(i);
         }
         }
      }
      System.out.println(p1+"\nrepeated:\n"+p2);
   }
}
