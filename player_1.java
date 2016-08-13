import java.util.*;
class player_1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
if(str!=null)
{
if(str.length()>0)
{
StringBuffer s1=new StringBuffer(str);
s1=s1.reverse();
System.out.println(s1.toString());
}
}
}
}
