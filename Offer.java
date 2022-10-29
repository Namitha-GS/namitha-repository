package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Offer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter then no of elements: ");
		int n=sc.nextInt();
		List<Product1> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter product dtls");
			String s = sc.next();
			String[] input = s.split(",");
			String name = input[0];
			Double price = Double.parseDouble(input[1]);
			Double disc = Double.parseDouble(input[2]);
			Product1 p = new Product1(name, price, disc);
			list.add(p);
		}
		
		for(int i=0;i<list.size();i++) {
		 System.out.println(list.get(i).getDiscPer());
		}
		//list.stream().filter(list -> list.getDiscPer().equals(Collections.min(list.getDiscPer()).forEach(System.out::println)));
		
	}

}

class Product1{
	private String name;
	private Double price;
	private Double disc;
	public Product1(String name, Double price, Double disc) {		
		this.name=name;
		this.price=price;
		this.disc=disc;
	}
	
	public double getDiscPer() {
		return price*disc/100;
	}
}
