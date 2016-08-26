

import java.util.Scanner;

public class arrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		char a[]=str.toCharArray();
		int in[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			in[i]=Character.getNumericValue(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(in[i]==i)
			{
				System.out.print(i+" ");
			}
		}
	}

}
