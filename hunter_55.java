import java.util.*;
class hunter_55
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int k=s.nextInt();
        String rotate="";
        if(n>0)
        {
        for(int i=0;i<n;i++)
        {
        a[i]=s.nextInt();
        rotate+=String.valueOf(a[i]);
        }
        if(k<n)
        {
        String sub=rotate.substring(k,rotate.length());
        StringBuffer s1=new StringBuffer(rotate);
        s1=s1.delete(k,rotate.length());
        rotate="";
        rotate=sub+s1.toString();
        for(int i=0;i<rotate.length();i++)
        {
        int m=Integer.parseInt(String.valueOf(rotate.charAt(i)));
          System.out.print(m+""+(i==rotate.length()-1?"":" "));
        }
        }
        else
           System.out.println("cant able to rotate");
        }
        else
          System.out.println("invalid");
        
        
    }
}
