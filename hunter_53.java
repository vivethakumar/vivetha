import java.util.*;
class hunter_53
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    if(str.length()>=1)
    {
    for(int i=0;i<str.length();i++)
    {
       System.out.print("p"+str.charAt(i));
       System.out.print((i==str.length()-1)?"":" ");
    }
    }
    
    }
}
