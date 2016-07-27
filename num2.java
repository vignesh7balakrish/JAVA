import java.util.*;
public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		int count=0;
		Scanner scan=new Scanner(System.in);
		start=scan.nextInt();
		end=scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			int flag=0;
			for(int j=1;j<=end;j++)
			{
				if(i%j==0)
				{
					flag++;
					
				}
				
			}
			if(flag==2)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
