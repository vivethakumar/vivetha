import java.io.*;
import java.util.*;
import java.lang.*;
class hunter_10
{
public static void main(String args[])
{
int a1[]=new int[]{1,2,3};
int a2[]=new int[]{2,3,1,2,3,5};
boolean flag=false;
if(a1.length<a2.length)
{
String s1=String.valueOf(a1);
String s2=String.valueOf(a2);
for(int i=0;i<s2.length();i++)
{
if(s2.regionMatches(i,s1,0,s1.length())
{
flag=true;break;
}
else
continue;
}
}
else
 flag=false;
if(flag)
System.out.println("a1 is subset of a2");
else
System.out.println("a1 is not a subset of a2");
}
}

