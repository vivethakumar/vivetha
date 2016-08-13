import java.util.*;
class pro_2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
String s1=String.valueOf(n),ss="";
String[] a=s1.split("");
boolean flag=false;
if(n>9)
{flag=true;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(Integer.parseInt(a[i])<Integer.parseInt(a[j]))
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
if(flag)
{
for(int i=0;i<a.length;i++)
{
ss+=a[i];
}StringBuffer str=new StringBuffer(ss);
for(int i=a.length-1;i>k-1;i--)
{ss="";
str=str.deleteCharAt(i);
}
ss=str.toString();
n=Integer.ParseInt(ss);
}
System.out.println(n);
}
}
