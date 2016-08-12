import java.util.*;
class hunter_63
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
  boolean flag=false;
  if(i==n-2)
  {
    a[i]=a[i+1];flag=true;
  }
if(i==n-1)
{
a[i]=0;break;
}
if(!flag)
{
for(int j=i+1;j<n;j++)
{
if(a[j-1]<a[j])
{
a[i]=a[j];break;
}
}
}
}
for(int j=0;j<n;j++)
System.out.println(a[j];
}
}
