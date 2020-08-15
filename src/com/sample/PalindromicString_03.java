package com.sample;

/**
 * 
 * @author Sangeetha
 *
 */
public class PalindromicString_03 {

	public static void main(String[] args) {
		try {
			
			String input = "MALAYALAM", reverse = "";

			int length = input.length();
			for (int i = length - 1; i >= 0; i--) 
				reverse = reverse + input.charAt(i);
				if (input.equals(reverse)) {
					System.out.println("Given String :" +input+" is a palindrome.");
				} else {
					System.out.println("Given String :" +input+ " isn't a palindrome.");
				}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
