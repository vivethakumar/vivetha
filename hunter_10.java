import java.io.*;
import java.util.*;
import java.lang.*;
class hunter_10
{
public static void main(String args[])
{
 String s1="",s2="";
int a1[]=new int[]{1,2,3};
int a2[]=new int[]{2,3,1,2,3,5};
boolean flag=false;
for(int i=0;i<a1.length;i++)
{
 s1+=String.valueOf(a1[i]);
}
for(int j=0;j<a2.length;j++)
{
 s2+=String.valueOf(a2[j]);
}
System.out.println(s1+" "+s2);
if(a1.length<a2.length)
{
for(int i=0;i<s2.length();i++)
{
if(s2.regionMatches(i,s1,0,s1.length()))
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

