import java.util.Scanner;

public class co1unt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.printf("%d  * %d = %d",i,num,(num*i));
			System.out.println();
		}
	}

}
