import java.io.*;
import java.util.*;
public class even1
{
  public static void main(String args[])
  {
    int start,end;
    Scanner obj=new Scanner(System.in)
    start=obj.nextInt();
    end=obj.nextInt();
    for(int i=start;i<=end;i++)
    {
      if(i%2==0)
      {
      System.out.println(i);
      }
    }
    }
  }
