import java.util.*;
class hunter_28
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       if(str.length()>1)
       {
       Set<Character> set=new LinkedHashSet<Character>();
       for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
        str="";
        Iterator it=set.iterator();
        while(it.hasNext())
        {
             char b=(char)it.next();
             str+=String.valueOf(b);
        }
        System.out.println("String after removing duplicates:"+str);
       }
       else
          System.out.println("String length is 1 no duplicates:"+str);
    }
}
