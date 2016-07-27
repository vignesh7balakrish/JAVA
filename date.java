import java.util.*;
public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Boolean num;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		num=fun(str);
		System.out.println(num);
	}
	static Boolean fun(String str)
	{
		if(str.equals("sunday"))
		{
					return false;	
		}
		else
		{
			return true;
		}
	}

}
