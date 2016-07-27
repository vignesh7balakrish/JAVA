import java.util.*;
public class fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=1;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
