import java.io.*;
import java.util.*;
public class fact
{
  public static void main(String args[])
  {
    int num;
    int sum=1;
    Scanner obj=new scanner(System.in);
    num=obj.nextInt();
    for(int i=1;i<=num;i++)
    {
      sum=sum*i;
    }
    Sysem.out.println(sum);
    }
    }
