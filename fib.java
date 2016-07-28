import java.util.*;
public class fib
{
  public static void main(String args[])
  {
    int a=0;
    int b=1;
    int n,c;
    Scanner scan=new Scanner(System.in);
    n=scan.nextInt();
    System.out.print(a);
    System.out.print(b);
    for(int i=0;i<n-2;i++)
    {
      int t;
      c=a+b;
      System.out.print(c);
      t=a;
      a=b;
      b=t;
    }
  }
  }
      
