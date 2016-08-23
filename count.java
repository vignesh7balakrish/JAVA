import java.util.*;
class count
{
  pubic static void main(String args[])
  {
    int num;
    System.out.println("enter the multiple table:");
   Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   for(int i=1;i<20;i++)
   {
    System.out.printf("%d * %d =%d",num,i,(num*i));
    }
  }
}
  
