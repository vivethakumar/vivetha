import java.util.*;
class hunter_15
{
public static void main(String args[])
{
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     if(n>0)
     {
     int z=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
           a[i]=s.nextInt();
        int sum=0,max=0;
        Set<String> set=new LinkedHashSet<String>();
        for(int i=0;i<n;i++)
        {
        if(a.length-i>=z)
        {
               int[] sub=new int[z];
               sum=0;
               int m=i,n1=0;
               boolean b=false;
               for(int k=0;k<z;k++)
               {
                  while(n1++<z)
                  {
                  b=true;
                  sub[k]=a[m++];
                  sum+=sub[k];
                  }
               }
               if(b)
               {
               if(sum>=max)
               {
                String sb="";
                 for(int k1=0;k1<sub.length;k1++)
               {
                   sb+=String.valueOf(sub[k1]); 
               }
               if(max!=sum)
                    {
                    max=sum;
                    set.clear();
                    set.add(sb);
                    }
                    else
                    set.add(sb);
               }
               }
        }
        Iterator it=set.iterator();
        while(it.hasNext())
         System.out.println(it.next());
        }
        }
     }
}
