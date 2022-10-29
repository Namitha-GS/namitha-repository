package basics;
import java.util.*;

public class BillGeneration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pp=100, pup=20,cdp=10;
		System.out.println("Enter pizza cnt :");
		int pc = sc.nextInt();
		System.out.println("Enter puff cnt :");
		int puc = sc.nextInt();
		System.out.println("Enter cool drink cnt :");
        int cdc = sc.nextInt();
        long price = (pc * pp) + (puc * pup) + (cdc * cdp);
        System.out.println(price);
	}

}
