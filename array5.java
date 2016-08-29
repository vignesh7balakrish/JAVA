import java.util.*;
public class array5
{
  public static void main(String args[])
  {
    String str;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    char a1[]=str.toCharArray();
    int num[]=new int[a1.length];
    for(int i=0;i<a1.length;i++)
    {
      num[i]=Character.getnumericValue(a1[i]);
    }
    int len=str.length();
    int l1=len/2;
    int sum=0;
    for(int i=0;i<=l1;i++)
    {
      sum=sum+num[i];
    }
    int l2=sum/l1;
    int sum1=0;
    int m=0;
    for(int j=l1+1;j<len;j++)
    {
      sum1=sum1+nums[j];
      m++;
    }
    int l3=sum1/m;
    if(l2==l3)
    {
      System.out.println("possible");
    }
    else
    {
        System.out.println("not possible");
      }
  }
}
