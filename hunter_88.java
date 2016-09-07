import java.util.*;
class hunter_88
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       String a=s.nextLine();
       ArrayList<Character> list=new ArrayList<Character>();
       String out="";
       if(a.length()>1)
       {
       for(int i=a.length()-1;i>=0;i--)
       {
         if(!list.contains(a.charAt(i)))
         {
         out+=String.valueOf(a.charAt(i));
         list.add(a.charAt(i));
         }
       }
       System.out.println(out);
       }
       else
         System.out.println(a);
    }
}
