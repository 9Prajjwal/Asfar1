package Q_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your input Number :-");
		int num = s1.nextInt();
		
		Test t1 = new Test();
		
		System.out.println(t1.display(num));
	}

}
