import java.util.*;
class player_41
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String t=sc.nextLine();
      boolean b=false;
       int index1=-1,index2=-1;
      if(s.length()==t.length())
      {
         for(int i=0;i<s.length();i++)
         {
            if(Character.isAlphabetic(s.charAt(i))&&Character.isAlphabetic(t.charAt(i)))
            {
                for(int j=0;j<s.length();j++)
                {
                   index1=s.indexOf(s.charAt(i),index1+1);
                   index2=t.indexOf(t.charAt(i),index2+1);
                   if(index1!=-1&&index2!=-1)
                   {
                       if(index1==index2)
                        {
                           b=true;
                        }
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
            if(!b)
            break;
          }
      }
      if(b)
      System.out.println("isomorphic");
      else
      System.out.println("not an isomorphic");
   }
}
