import java.util.*;
class player_14
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     StringBuffer s1=new StringBuffer(s).reverse();
     char a[]={'a','e','i','o','u'};
     for(int i=0;i<s1.length();i++)
     {
        for(int j=0;j<a.length;j++)
        {
        s1=s1.deleteCharAt(i);
        i--;
        break;
        }
     }
     System.out.println(s1.toString());
  }
}
