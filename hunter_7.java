import java.util.*;
class hunter_7
{
   public static void main(String args[])
   {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   if(n>0)
   {
   int a[]new int[n];
   Map<Integer,Integer> set=new LinkedHashMap<Integer,Integer>();
   for(int i=0;i<n;i++)
   {
   a[i]=s.nextInt();
   if(!set.contains(a[i]))
      set.put(a[i],1);
   else
     set.put(a[i],set.get(a[i])+1);
   }
   Set ss=set.entrySet();
   Iterator it=ss.iterator();
   while(it.hasNext())
   {
     Map.Entry e=(Map.Entry)it.next();
     if(e.getvalue==1)
     System.out.println(e.getkey());
   }
   }
   }
}
