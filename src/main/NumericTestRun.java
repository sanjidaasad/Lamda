package main;

public class NumericTestRun {
	
	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2) == 0;
		NumericTest isNegative = (n) -> (n<0);
		Hello sayHello = (name) -> "Good Evening " + name;
		
		System.out.println(isEven.computeTest(5));
		System.out.println(isEven.computeTest(12));
		System.out.println(isNegative.computeTest(5));
		System.out.println(isNegative.computeTest(-6));
		
		System.out.println(sayHello.greetings("Urmi"));
		System.out.println(sayHello.greetings("Happy"));
	}

}
