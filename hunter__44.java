import java.io.*;
import java.util.*;
class hunter_4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=a.nextInt();
}int count=0;boolean flag=false;
for(int j=0;j<n;j++)
{count=0;
int b=a[j];
for(int k=0;k<n;k++)
{
if(b==a[k])
{
count++;
}
if(count==1)
{
flag=true;
System.out.println(a[k]);
}
}
}
if(!flag)
System.out.println("no number is unique");
}
}
