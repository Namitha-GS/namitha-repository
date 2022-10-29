package basics;
import java.util.*;

public class Unique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();
		if(!printU(name)) {
			System.out.println("invalid");
		}

	}
	
	private static boolean printU(String s) {
		Map<Character,Integer> map= new LinkedHashMap<>();
		char[] chars = s.toCharArray();
		for(char c : chars) {
			if(Character.isDigit(c)) {
				return false;
			} else if(!Character.isWhitespace(c)) {
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
		List<Character> list = new ArrayList<>();
		
		System.out.println(map);
		System.out.println(map.keySet());
		for(char c:map.keySet()) {
			if(map.get(c)==1) {
				list.add(c);
			}
		}
		for(char c:list) {
			System.out.println(c);
		}
		return true;
	}

}
