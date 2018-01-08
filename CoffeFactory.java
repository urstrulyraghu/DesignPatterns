package com.accolite.singleton;

import java.util.Scanner;

public class CoffeFactory {
	
	public static Coffee createCoffee(int choice) {
		
		Coffee coffee = null;
		
		switch(choice){
		
			case 1: coffee =  new Cappucino();
					break;
					
			case 2: coffee =  new Latte();
					break;
					
			case 3: coffee =  new Espresso();
				   break;
		}
		return coffee;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice: 1.Cappucino\n 2.Latte\n 3.Espresso\n");
		int ch = sc.nextInt();
		Coffee coffee = createCoffee(ch);
		coffee.serveCoffee();
	}
}
