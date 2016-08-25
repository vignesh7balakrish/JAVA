import java.util.*;
public class SWAP
{
  public static void main(String args[])
  {
    int a,b;
    Scanner scan=new Scanner(System.in);
    a=scan.nextInt();
    b=scan.nextInt();
    int t;
    t=a;
    a=b;
    b=t;
    System.out.print(a+" "+b);
  }
}
  
