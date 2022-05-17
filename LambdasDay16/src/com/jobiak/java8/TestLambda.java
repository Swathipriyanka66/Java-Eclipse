package com.jobiak.java8;
//java8 vs interfaces - functional interface
@FunctionalInterface
interface Test {
	public default void paint() {System.out.println("from default method");};
	public static void method() { System.out.println("from static method");};
	public void print();
	
}
class TestImpl implements Test{
	@Override
	public void print() {
		
	}
	
}
interface Test2 {
	public void add(int a,int b);
}
interface Test3{
	public int fact(int n);
}
interface Test4{
	public String getString();
}

public class TestLambda {

	public static void main(String[] args) {
		
		Test test = () -> {System.out.println("from print....printing");};
		
		test.print();
		Test2 test2 = (int a, int b)-> {
			int c=a+b;
			System.out.println(c);
		};
		test2.add(25,46);
		Test3 test3 = (int n) -> {
			int fact=1;
			int i=1;
			while(i<=n) {
				fact*=i;
				i++;
			}
			return fact;
		};
		int factorialResult = test3.fact(50);
		System.out.println(factorialResult);
		
		Test4 t4 = ()-> "Priya Yanamandra";
		System.out.println(t4.getString());
		
		Runnable r = new Runnable() {
		public void run() {
			System.out.println("from run method...");
		}
	};
		Thread thread = new Thread(r);
		thread.start();
		
		Runnable r1 =() ->{
			System.out.println("from ()-> run method....");
		};
		thread=new Thread(r1);
		thread.start();
		
	}

}
