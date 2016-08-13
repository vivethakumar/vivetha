import java.util.*;
class hunter_4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
if(n>0)
{
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
count=0;
boolean flag=false;
if(i>1)
{
for(int k=0;k<9;k++)
{
if(a[k]==a[i])
{
flag=true;break;
}
}
if(!flag)
{
for(int j=0;j<n;j++)
{
if(a[i]==a[j])
count++;
}
}
if(count==1)
System.out.println(a[i]);
}
else
System.out.println("wrong");
}
}
