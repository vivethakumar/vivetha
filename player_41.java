import java.util.*;
class player_41
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String t=sc.nextLine();
      boolean b=false;
      if(s.length()==t.length())
      {
         for(int i=0;i<s.length();i++)
         {
            if(Character.isAlphabetic(s.charAt(i))&&Character.isAlphabetic(t.charAt(i))
            {
            int index1=-1,index2=-1;
           b=false;
                for(int j=0;j<s.length();j++)
                {
                   int index1=s.indexOf(s.charAt(j),index1+1);
                   int index2=s.indexOf(t.charAt(j),index2+1);
                   if(index1!=-1&&index2!=-1)
                   {
                       if(index1==index2)
                          b=true;
                        else
                        {
                          b=false;break;
                        }
                   }
                }
             }
                else
                {
                b=false;break;
                }
          }
      }
      if(b)
      System.out.println("isomorphic");
      else
      System.out.println("not an isomorphic");
   }
}
