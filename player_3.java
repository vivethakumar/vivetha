import java.util.*;
class player_3
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
if(n>9||n<(-9))
{
String s=String.valueOf(n);
StringBuilder ss=new StringBuilder(s);
ss.reverse();
n=Integer.parseInt(ss.toString());
System.out.println(n);
}
else
System.out.println(n);
}
}
