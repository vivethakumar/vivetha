import java.util.*;
class player_14
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     StringBuffer s1=new StringBuffer(str);
     s1=s1.reverse();
     System.out.println("output1:"+s1);
     char a[]={'a','e','i','o','u'};
     if(s1.length()>=1)
     {
     for(int i=0;i<s1.length();i++)
     {
        for(int j=0;j<a.length;j++)
        {
          if(s1.charAt(i)==a[j])
          {
        s1=s1.deleteCharAt(i);
        i--;
        break;
          }
        }
     }
     }
     System.out.println("output2:"+s1.toString());
  }
}
