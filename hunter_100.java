import java.util.*;
class hunter_100
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Long n=s.nextLong();
        long tot=1;
        String str=String.valueOf(n);
        String s1[]=str.split("");
        for(int i=0;i<s1.length&&(i+1)<s1.length;i++)
        {
           tot+=Math.pow(Integer.parseInt(s1[i]),Integer.parseInt(s1[i+1]));
        }
        System.out.println(tot);
    }
}
