import java.util.*;
class hunter_103
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      long n=s.nextLong();
      String str=String.valueOf(n);
      String s1[]=str.split("");
      int len=s1.length;
      if(n>9)
      {
      n=0;
      for(int i=0;i<len;i++)
      {
          int k=Integer.parseInt(s1[i]);
          for(int j=0;j<len-1;j++)
          {
             k*=Integer.parseInt(s1[i]);
          }
          n+=k;
      }
      System.out.println(n);
      }
      else
        System.out.println("invalid input");
    }
}
