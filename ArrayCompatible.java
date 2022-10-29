package basics;
import java.util.*;

public class ArrayCompatible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array size :");
		int m = sc.nextInt();
		System.out.println("Enter 1st array elements :");
		int[] arr1 = new int[m];
		for(int i=0;i<m;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd array size :");
		int n = sc.nextInt();
		System.out.println("Enter 2nd array elements :");
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		if(isCompatible(arr1, arr2)) {
			System.out.println("Compatible");
		} else {
			System.out.println("Not compatible");
		}
	}
	
	public static boolean isCompatible(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		} else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] < arr2[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
