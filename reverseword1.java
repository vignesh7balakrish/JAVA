import java.util.*;
public class reverseword1
{
  public static void main(String args[])
  {
    String str;
    Scanner sc=new Scanner(System.in);
    str=sc.nextL8ine();
    String str1[]=str.split("");
    for(int i=str1.length-1;i>=0;i--)
    {
      System.out.print(str[i]+" ");
    }
  }
}
