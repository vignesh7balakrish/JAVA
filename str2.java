import java.util.*;
public class STR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			String str1;
			Scanner scan=new Scanner(System.in);
			num=scan.nextInt();
			str1=String.valueOf(num);
			StringBuffer str11=new StringBuffer(str1);
			str11.reverse();
			str1=str11.toString();
			System.out.println(str1);
		
	}

}
