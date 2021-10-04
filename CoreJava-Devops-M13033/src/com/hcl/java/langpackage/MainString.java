package com.hcl.java.langpackage;

public class MainString {

	public static void main(String[] args) {

		// String literals
		String s1 = "HCL";
		String s2 = "HCL";

		System.out.println("------Using String Literals------");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		System.out.println();

		// String objects (using new keyword)
		String s3 = new String("HCL");
		String s4 = new String("HCL");

		System.out.println("------Using String Objects------");
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3.equals(s4) : " + (s3.equals(s4)));

		String s5 = "HCL";
		String s6 = new String("HCL");

		System.out.println("------Using a String Literals & a String Objects------");
		System.out.println("s5 == s6 : " + (s5 == s6));
		System.out.println("s5.equals(s6) : " + (s5.equals(s6)));

		// String methods
		String str = "java";
		int lengthResult = str.length();
		System.out.println("Length of String :" + lengthResult);

		char charResult = str.charAt(2);
		System.out.println("Character at particular index :" + charResult);

		int indexResult = str.indexOf('a');
		System.out.println("Index at particular location or char :" + indexResult);

		int lastIndexResult = str.lastIndexOf('a');
		System.out.println("Last Index at particular location or char :" + lastIndexResult);

		// equals and equalsIgnoreCase
		String password = "java";
		String confirmPassword = "Java";
		if (password.equalsIgnoreCase(confirmPassword)) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}
		// concat (adding String)
		String firstString = "Java is ";
		String secondString = "OOP Language";
		String concatResult = firstString.concat(secondString);
		System.out.println(concatResult);

		System.out.println(password.toUpperCase());
		System.out.println(password.toLowerCase());

		String str1 = "HCL";
		System.out.println(str1.toLowerCase());
		String name = "Java";
		System.out.println(name.replace('J', 'H'));
		System.out.println(name.substring(1, 3));
		int compareResult = name.compareTo("java");
		System.out.println(compareResult);

		String str2 = "    Java      ";
		System.out.println(str2.trim());
		System.out.println();
		String java = "Java is object oriented Programming";
		String[] splitResult = java.split(" ");
		for (int i = 0; i < splitResult.length; i++) {
			System.out.println(splitResult[i]);
		}
		
		String strObj = new String("Java is object oriented Programming");
		char[] arrayResult = strObj.toCharArray();
		for (int i = 0; i < arrayResult.length; i++) {
			System.out.print(arrayResult[i]+" ");
		}
		//for each
		for(char result:arrayResult) {
			System.out.print(result+ "\t");
		}
		
	}

}
