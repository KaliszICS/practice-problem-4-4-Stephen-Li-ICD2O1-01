/*
File: Lesson 4.4 - Boolean Functions with Loops
Author: Stephen Li
Date Created: April 13, 2026
Date Last Modified: April 13, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean hasCapital(String word1) {
		for (int i = 0; i < word1.length(); i++) {
			if (Character.isUpperCase(word1.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPrime(int num1) {
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				return false;
			}
		}
		if (num1 <= 1) {
			return false;
		} 
		return true;
	}

}
