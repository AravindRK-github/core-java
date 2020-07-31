package week4.day1;

import java.util.Arrays;

public class DuplicateNumber {
public static void main(String[] args) {
	int[] data1 = {2,6,8,1,5,9,3,7,9,3,7,1};
	
	
		Arrays.sort(data1);
		System.out.println(Arrays.toString(data1));
		for (int i = 0; i < data1.length-1; i++) {
		if(data1[i]==data1[i+1]) {
			System.out.println("duplicate value:"+data1[i]);
		}
	}
	}
}