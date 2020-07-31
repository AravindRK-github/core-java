package week1.day2;

public class Calculator {
	public int addTwoNumber() {
		int a=10;
		int b=15;
		int c= a+b;
		System.out.println(c);
		
		return c;
	}
public static void main(String[] args) {
	Calculator calc = new Calculator();
   int twoNumber = calc.addTwoNumber();
	System.out.println(twoNumber);
}
}
