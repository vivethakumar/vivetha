import java.util.*;
class hunter_27
{
     public static void main(String[] args)
     {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String set="";
        int max=0;
        if(str.length()>1)
        {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
             String sub=str.substring(i,j);
             StringBuffer sb=new StringBuffer(sub).reverse();
             if(!sub.equalsIgnoreCase(sb.toString()))
            {
                  if(max<sub.length())
                  {
                   max=sub.length();
                   set=sub;
                  }
            }
            }
        }
        if(set.length()>=1)
          System.out.println("maximum substring which is not palindrome is:"+set);
        else
           System.out.println("String length is "+str.length()+" but no palindrome");
        }
        else
        System.out.println("no palindrome");
     }
}
