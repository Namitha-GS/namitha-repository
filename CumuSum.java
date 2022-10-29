package basics;
import java.util.*;

public class CumuSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements :");
		int sum=0;
		StringJoiner sj = new StringJoiner(" ");
        for(int i=0;i<n;i++) {
        	sum += sc.nextInt();
        	sj.add(String.valueOf(sum));
        }
        System.out.println(sj); // (char)num
	}

}
