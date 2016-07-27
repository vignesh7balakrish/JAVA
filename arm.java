import java.util.*;
public class arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n1,rem=0,sum=0;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		n1=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(n1==sum)
		{
			System.out.println(n1+" "+"armstrong number");
		}
		else
		{
			System.out.println(n1+" "+"not armstrong number");
		}

	}

}
