package com.hcl.java.day3HandsOnExcercise;
import java.util.Scanner;
public class PangramOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		 
	    System.out.println("Enter a string:");
	    String str= scan.nextLine();	 
	    int count[] = new int[26];
	    boolean pangram = true;        
	    char ch;
	    for(int i=0; i<str.length(); i++){
	        ch = str.charAt(i);	        
	        if(ch == ' ')
	        continue;	       
	        if(ch>='A' && ch<='Z'){
	            count[ch-'A']++;      
	        } else if(ch>='a' && ch<='z'){
	            count[ch-'a']++;      
	        }	 
	    }
	    for(int i=0; i<count.length; i++){
	      if(count[i] == 0){
	        pangram = false;    
	        break;
	      }
	    }	 
	    if(pangram)
	      System.out.println("Pangram");
	    else 
	      System.out.println("Not a Pangram String");	 
	    scan.close();
	}
}
