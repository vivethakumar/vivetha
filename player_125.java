import java.util.*;
class player_125
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n1=s.nextInt();
       int sum=0;
       ArrayList<Integer> a1=new ArrayList<Integer>();
       for(int i=0;i<n1;i++)
           a1.add(s.nextInt());
       int n2=s.nextInt();
       for(int i=0;i<n2;i++)
       {
           int b=s.nextInt();
           if(a1.contains(b))
             sum+=b;
       }
       System.out.println(sum);
    }
}
