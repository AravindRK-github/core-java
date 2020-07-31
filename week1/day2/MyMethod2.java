package week1.day2;

public class MyMethod2 {

		public int addTwoNumber(int a, int b) {
			
			int sum=a+b;
			return sum;
		}
		public int subTwoNumber(int e,int f) {
			
			int d=e-f;
			return d;
			
		}
		public int multiTwoNumber(int x, int y) {
			
			int z=x*y;
			return z;
		}
		public int divisionTwoNumber(int m,int n) {
			
			int o=m/n;
			return o;
		}
		public void simpleNoAdd()
		{
			System.out.println("there is no number");
		}
public static void main(String[] args) { 
	
		MyMethod2 obj =new MyMethod2();
		int result1= obj.addTwoNumber(100,200);
		System.out.println(result1);
		int result2 = obj.subTwoNumber(50,26);
		System.out.println(result2);
		int result3 = obj.multiTwoNumber(20,4);
		System.out.println(result3);
		int result4 = obj.divisionTwoNumber(100,5);
		System.out.println(result4);
		
		obj.simpleNoAdd();
		
	}
	}
	


