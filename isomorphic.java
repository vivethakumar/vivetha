import java.util.*;
class isomorphic
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
int index1=-1;
int index2=-1;
boolean flag=true;
if(s1.length()==s2.length())
{
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
char b=s1.charAt(i);
if(Character.isAlphabetic(a)&&Character.isAlphabetic(b))
{
for(int k=0;k<s1.length();k++)
{
index1=s1.indexOf(a,index+1);
index2=s2.indexOf(b,index2+1);
if(index1==index2)
{
flag=true;
}
else
{
flag=false;
break;
}
}
}
}
else
{
flag=false;
break;
}
if(!flag)
break;
}
}
System.out.println(flag);
}
}
