import java.io.*;
import java.util.*;
class program1
{
public static void main(String args[])
{
boolean flag=false;
int n;
Scanner s=new Scanner(System.in);
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(i==a[i])
{
flag=true;
System.out.println(i);
}
}
if(!flag)
System.out.println(0);
}
}
