import java.util.*;
class player_9
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     int num1=s.nextInt();
     int num2=s.nextInt();
     int min=0,max=0;
     int count=0;
     if(num1>num2)
     {
     max=num1;
     min=num2;
     }
     else
     {
     max=num2;
     min=num1;
     }
     if(min<=0)
     {
       min=1;
     }
     else if(max<=0)
     max=1;
     for(int i=min;i<=max;i++)
     {
        boolean flag=true;
        for(int j=2;j<i;j++)
        {
           if(i%j==0)
           {
              flag=false;break;
           }
        }
        if(flag)
        count++;
     }
     System.out.println(count);
  }
}
