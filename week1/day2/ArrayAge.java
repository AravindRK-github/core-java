package week1.day2;

import java.util.Arrays;

public class ArrayAge {
public static void main(String[] args) {
	
	int[] ages = {1,2,3,4,5};
	int length = ages.length;
	System.out.println(length);
	
	for (int i = 0; i < ages.length; i++) {
		System.out.println(ages[i]);
	}
	
	//String another way
	String[] names=new String[7];
	names [0]="Arun";
	names [1]="Aravind";
	names [2]="Apsara";
	names [3]="Amala";
	names [4]="Anitha";
	names [5]="Arjun";
	names [6]="Angitha";
	for (int i = 0; i < names.length; i++) {
		Arrays.sort(names);
		System.out.println(names[i]);
	}
	System.out.println("----------------------------------------------------------");
	
	
}
}

