package basics;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Pattern p = Pattern.compile("^GBL/(\\d){3}/(\\d){4}$");
	 System.out.println("Enter ID :");
     String s = sc.next();
     Matcher m = p.matcher(s);
     if(m.matches()) {
    	 System.out.println("Valid");
     } else {
    	 System.out.println("Invalid");
     }
	}

}
