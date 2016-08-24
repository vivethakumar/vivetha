import java.util.*;
class pro_1
{
   public static void main(String args[])
   {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         String s1[]=new String[n];
         for(int i=0;i<n;i++)
            s1[i]=s.next();
        String sub="",submax="";
        int count=0,max=0;
        for(int i=0;i<s1.length;i++)
        {
             for(int j=i+1;j<s1.length;j++)
             {
                 sub="";count=0;
                 for(int k=0;k<s1[i].length()&&k<s1[j].length();k++)
                 {
                     if(s1[i].charAt(0)==s1[j].charAt(0))
                     {
                        if(s1[i].charAt(k)==s1[j].charAt(k))
                        { 
                           sub+=s1[i].charAt(k);
                           count++;
                        }
                        else
                           break;
                     }
                     else
                        break;
                 }
                 if(max<count)
                 {
                    max=count;submax="";
                    submax=sub;
                 }
             }
        }
        System.out.println("longest prefix:"+submax);
   }
}
