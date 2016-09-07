import java.util.*;
class hunter_88
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       String a=s.nextInt();
       ArrayList<Character> list=new ArrayList<Character>();
       String out="";
       for(int i=a.length()-1;i>=0;i--)
       {
         if(!list.containsOf(a.charAt(i))
         {
         out+=String.valueOf(a.charAt(i));
         }
       }
       System.out.println(out);
    }
}
