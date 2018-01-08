package com.accolite.singleton;

class Singleton{
	
	String name;
	int value;
	static Singleton singleton = null;

	private Singleton(){		
		name = "raghu";
	}

	public static synchronized Singleton instance(){
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}

public class SingletonThread extends Thread
{
	String nameAssign;
	static int counter=1;
	
	void printObject()
	{
		Singleton s=Singleton.instance();
		System.out.println(s.name);
	}
	
	public static void main(String args[])
	{
		SingletonThread singletonThread = new SingletonThread();
		singletonThread.printObject();

		for(int i=0;i<10;i++)
		{
			Thread t=new Thread(singletonThread);
			t.start();
		}
	}
	
	public void run()
	{
		Singleton s=Singleton.instance();
		System.out.println(s.name + "\n" + s.value);
		counter++;
		s.value =counter;
		
	}
}

