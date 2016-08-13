import java.util.*;
class hunter_9
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>=1)
{
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt():
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]+a[j]==0)
System.out.println(a[i]+"+"+a[j]+"="+0);
}
}
}
else
System.out.println(0);
}
}
