import java.util.*;
public class STR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str;
			Scanner scan=new Scanner(System.in);
			str=scan.nextLine();
			StringBuffer str1=new StringBuffer(str);
			str1.reverse();
			str=str1.toString();
			System.out.println(str);
		
	}

}
