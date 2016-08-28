import java.util.*;
class hunter_40
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int sum=0;
       boolean b=true;
       if(n>9)
       {
              int num=n;
              while(num!=0)
              {
                sum+=num%10;
                num=num/10;
              }
       StringBuffer str=new StringBuffer(String.valueOf(sum)).reverse();
       if(!String.valueOf(sum).equals(str.toString()))
          b=false;
       }
       if(b)
         System.out.println("palindrome");
       else
         System.out.println("not a plindrome");
         
    }
}
