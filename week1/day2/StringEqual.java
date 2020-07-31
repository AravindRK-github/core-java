package week1.day2;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="Test Leaf";
		String text2="test leaf";
		//"test leaf" same value bt their case sensitive so their not equal
		boolean equals = text1.equals(text2);
		System.out.println(equals);

		//they two string are case sensitive bt therir value and pronouns are same so ignore the case sensitive
		String text5="Test Leaf";
		String text6="test leaf";
		boolean equalsIgnoreCase = text5.equalsIgnoreCase(text6);
		System.out.println("equalsIgnoreCase: "+equalsIgnoreCase);


		//they string value are equal
		String text3="test leaf";
		String text4="test leaf";
		boolean equals2 = text3.equals(text4);
		System.out.println(equals2);
//remove the white spaces
		String text8="                                                      ALL IS WELL                          ";
		System.out.println(text8);
		String trim = text8.trim();
		System.out.println(trim);
		//cut the particular letter in the word
		String obj="TextImage";
		String substring = obj.substring(4);
		System.out.println(substring);
		//cut the particular part in the word start to end
		String substring2 = obj.substring(2, 6);
		System.out.println(substring2);
		
		//cut the particular character
		String obj1="GOOD MORNING";
		char charAt = obj1.charAt(5);
		System.out.println(charAt);
		String replace = obj1.replace('O', 'a');
		System.out.println(replace);
	}

}
