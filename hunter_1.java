import java.util.*;
class hunter_1
{
     public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         if(n>0)
         {
            int a[]=new int[n];
            Set<Integer> a1=new HashSet<Integer>();
            for(int i=0;i<n;i++)
            {
               a[i]=s.nextInt();
            }
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                  if(a[i]==a[j])
                   {
                    a1.add(a[i]);
                    break;
                   }
                }
            }
            if(a1.size()>0)
            {
               Iterator it=a1.iterator();
               while(it.hasNext())
                  {
                    System.out.println(it.next());
                  }
            }
            else 
                System.out.println("no repeated integers");
         }
         else
            System.out.println("invalid");
     }
}
