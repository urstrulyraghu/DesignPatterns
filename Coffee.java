package com.accolite.singleton;

public class Coffee {
	String name;

	public Coffee(String name) {
		super();
		this.name = name;
	}
	
	void serveCoffee()
	{
		System.out.println("Serving Coffee : " + name + " \n");
	}
	
}

class Cappucino extends Coffee{
	
	public Cappucino() {
		super("Capuccino");
	}
	
}

class Latte extends Coffee{
	
	public Latte() {
		super("Latte");
	}
}

class Espresso extends Coffee{
	
	public Espresso() {
		super("Espresso");
	}
	
}

