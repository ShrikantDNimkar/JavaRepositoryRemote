
import java.util.Scanner;
import java.util.StringTokenizer;

public class DelimeterOrSplitUse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//String str = "Ankita|9874521365897456|14/02/2021";
		StringTokenizer strToken=new  StringTokenizer(str, "|");
		
	    
	      System.out.println((String)strToken.nextElement());
	      System.out.println((String)strToken.nextElement());
	      System.out.println((String)strToken.nextElement());
		

	}

}
