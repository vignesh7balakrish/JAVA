import java.util.*;
public class firstarray
{
  public static void main(String args[])
  {
    int arr;
    Scanner sc=new Scanner(System.in);
    arr=sc.nextInt();
    int num[]=new int[arr];
    for(int i=0;i<arr;i++)
    {
      num[i]=sc.nextInt();
    }
    for(int j=1;j<arr;j++)
    {
      if(num[0]==num[j])
      {  
        System.out.print(num[0]);
        break;
      }
    }
  }
}
        
