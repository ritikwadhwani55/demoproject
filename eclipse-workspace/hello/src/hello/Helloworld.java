package hello;

import java.util.Scanner;

class Grandparent {
	int g1=20;
	void show() {
		System.out.println("From grandparent : "+g1);
	}
}

class Parent{
	int p1=30;
	void show() {
		System.out.println("From parent: "+p1);
	}
}
class Child {
	int c1=50;
	void dis() {
		System.out.println("from child : "+c1);
	}
}
public class Helloworld {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
//		Employee arr[] = new Employee[n];
		StringBuffer sb = new StringBuffer("Ritik Wadhwani");
//		sb.replace(0, 5, "Lachhmandas");
//		sb.replace()
//		System.out.println(sb);
	}
}
