package basics;
import java.util.*;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit :");
		int car = sc.nextInt();
		int sum =0;
		for(char c : String.valueOf(car).toCharArray()) {
			System.out.println(Character.digit(c,10));;
			sum = sum + Character.digit(c,10);
		}
         if(sum % 3 ==0 || sum %5==0 || sum%7==0) {
        	 System.out.println("lucky");
         } else {
        	 System.out.println("not");
         }
	}

}
