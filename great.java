import java.util.*;
public class great
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner scan=new Scanner(Sytem.in);
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    if(a>b && a>c)
      System.out.print(a+"is big");
    else if(b>c)
      System.out.print(b+"is big");
      else
        System.out.print(c+"is big");
    }
  }
