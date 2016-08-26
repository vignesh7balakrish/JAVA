package coms.basics;

import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
		int n1=x;
		int res=1;
		while(n1!=0)
		{
			int t=n1%10;
			res=res*t;
			n1=n1/10;
		}
		res=res*x;
		if(res==y)
			System.out.println("seed");
		else
			System.out.println("no seed");
	}

}
