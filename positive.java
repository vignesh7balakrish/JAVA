import java.util.Scanner;
public class positive
{
  public static void main(String args[])
  {
    int n;
    Scanner scan=new Scanner(System.in);
    n=scan.nextInt();
    if(n>0)
    {
    System.out.println(n+"is a negative number");
    }
    else if(n<0)
    {
    System.out.println(n+"is a positive number");
    }
    else
    {
      System.out.println("zero");
    }
  }
  }
