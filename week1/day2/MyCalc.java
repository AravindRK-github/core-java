package week1.day2;
//method 1
public class MyCalc {
	public int addTwoNumber() {
		int a=20;
		int b=5;
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public int subTwoNumber() {
		int e=30;
		int f=20;
		int d=e-f;
		System.out.println(d);
		return d;

	}
	public int multiTwoNumber() {
		int x=25;
		int y=25;
		int z=x*y;
		System.out.println(z);
		return z;
	}
	public int divisionTwoNumber() {
		int m=50;
		int n=5;
		int o=m/n;
		System.out.println(o);
		return o;
	}
	public void moduloTwoNumber() {
		System.out.println("modulo division");
	}
	public static void main(String[] args) {
		MyCalc obj =new MyCalc();
		obj.addTwoNumber();
		obj.subTwoNumber();
		obj.multiTwoNumber();
		obj.divisionTwoNumber();

		obj.moduloTwoNumber();
	
		
	}
}
