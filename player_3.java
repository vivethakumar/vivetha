import java.util.*;
class player_3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>9||n<(-9))
{
String s=String.valueOf(n);
StringBuilder ss=new StringBuilder(s).reverse();
n=Integer.parseInt(ss.toString());
System.out.println(n);
}
else
System.out.println(n);
}
}
