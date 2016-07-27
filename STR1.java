import java.util.*;
public class STR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			String str;
			Scanner scan=new Scanner(System.in);
			n=scan.nextInt();
			str=String.valueOf(n);
			StringBuffer str1=new StringBuffer(str);
			str1.reverse();
			str=str1.toString();
			System.out.println(str);
		
	}

}
