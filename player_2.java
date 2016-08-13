import java.util.*;
class player_2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int fact=1;
if(n>=0)
{
for(int i=1;i<=n;i++)
fact*=i;
System.out.println(fact);
}
else
System.out.println(0);
}
}
