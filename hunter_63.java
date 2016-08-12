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
if(i==n-1)
{
a[i]=0;break;
}
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
a[i]=a[j];break;
}
}
}
for(int j=0;j<n;j++)
System.out.println(a[j];
}
}
