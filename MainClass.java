package basics;

public class MainClass { // file name and class name should be same, it shd start with Capital letter
	
	public static void main(String args[]) {
		Person p = new Person();
		p.age=2;
		p.name="abc";
		
		System.out.println(p.age+" "+p.name);
	}

}

// In ONE file, there will be only ONE Public Class
class Person{
	String name;
	int age;
}
