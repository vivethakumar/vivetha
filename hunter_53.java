import java.util.*;
class hunter_53
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int len=s.nextInt();
    if(len>1)
    {
        String s1=String.valueOf(str.charAt(0));
    for(int i=0;i<str.length();i++)
    {
        s1+=str.charAt(i);
       if(s1.length()==len)
       {
       System.out.print(s1);
       s1=String.valueOf(str.charAt(0));
       System.out.print((i==str.length()-1)?"":" ");
       }
    }
    }
    else if(len<=0)
       System.out.println("invalid");
     else
    {
        for(int i=0;i<str.length();i++)
        {
          System.out.print(str.charAt(0));
          System.out.print((i==str.length()-1)?"":" ");
        }
    }
    
    }
}
