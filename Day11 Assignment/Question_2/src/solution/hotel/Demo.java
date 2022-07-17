package solution.hotel;

import java.util.Scanner;

public class Demo {
	
	public static void provideFood(int num) {
		
		if(num>=1000) {
			TajHotel t1 = new TajHotel();
			
			t1.chickenBriyani();
			t1.masalaDosa();
			t1.welcomeDrink();
			
		} else if(num>200 && num <1000) {
			RoadSideHotel r1 = new RoadSideHotel();
			
			r1.chickenBriyani();
			r1.masalaDosa();
		} else {
			System.out.println("Please enter valid amount");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to spend on food today :-");
		 int num = s1.nextInt();
		 
		 provideFood(num);
	}

}
