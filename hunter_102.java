import java.util.*;
class hunter_102
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=String.valueOf(n);
        String[] s1=str.split("");
        if(n>9)
        {
        n=0;
        for(int i=0;i<s1.length;i++)
        {
           for(int j=0;j<=i;j++)
              n+=Integer.parseInt(s1[j]));
        }
        System.out.println(n);
        }
        else
           System.out.println("invalid input");
    }
}
