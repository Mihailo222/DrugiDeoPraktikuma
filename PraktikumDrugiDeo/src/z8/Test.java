package z8;

public class Test {
	
	public static void main(String[] args) {
		AnalizatorSlovaUTekstu a;
		a=new AnalizatorSlovaUTekstu();
		
		
		a.tekst=" The compareTo() method compares two strings lexicographically.\r\n"
				+ "\r\n"
				+ "The comparison is based on the Unicode value of each character in the strings.\r\n"
				+ "\r\n"
				+ "The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).\r\n"
				+ "\r\n"
				+ "Tip: Use compareToIgnoreCase() to compare two strings lexicographyically, ignoring lower case and upper case differences.\r\n"
				+ "\r\n"
				+ "Tip: Use the equals() method to compare two strings without consideration of Unicode values.";
		
		
		
		System.out.println(a.brojacRecenica());
		System.out.println(a.brojPojavljivanjaParametra('a'));
		
		System.out.println(a.brojPojavljivanjaSamoglasnika());
		
		System.out.println(a.vratiDrugiIndex());
		
	}

}
