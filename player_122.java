import java.util.*;
import java.text.*;
class player_122
{
     public static void main(String[] args)throws ParseException
     {
       Scanner s=new Scanner(System.in);
       SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
       String source=s.next();
       Date d=date.parse(source);
       int n=d.getMonth();
       if(n>0&&n<=12)
       {
           String[] str={"january","february","march","april","may","june","july","august","september","october","november","december"};
           for(int i=0;i<str.length;i++)
           {
              if(n==(i+1));
              {
                 System.out.println(str[n]);
                 break;
              }
           }
        }
        else
           System.out.println("invalid");
     }
}
