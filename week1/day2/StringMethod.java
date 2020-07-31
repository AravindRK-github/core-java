package week1.day2;

public class StringMethod {
public static void main(String[] args) {
	  String text="TestLeaf";
	  //1,change all letter in capital letter
	  String upperCase = text.toUpperCase();
	  System.out.println("uppercase: "+upperCase);
	  
	  //2,change all letter in small letter
	  
	  String lowerCase = text.toLowerCase();
	  System.out.println("lowerCase: "+lowerCase);
	  
	  //3.length of the testLeaf
	  
	  int length = text.length();
	  System.out.println("length: "+length);
	  
	  //4.Add two string
	  String text2="test leaf";
	  String text3="chennai";
	  String place=text2+text3;
	  System.out.println("place: "+place);
	  String concat = text2.concat(text3);
	  System.out.println("concat: "+concat);
	  
	  String text4="testleaf is in chennai";
	  boolean contains = text4.contains("chennai");
	  System.out.println("contains: "+contains);
}
}
