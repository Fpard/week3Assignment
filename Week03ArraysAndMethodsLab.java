package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int [] first_Array = {1,5,2,8,13,6};

		
		// 2. Print out the first element in the array
		System.out.println("Print out the first element in the array");
		System.out.println(first_Array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("Print out the last element in the array");
		System.out.println(first_Array[first_Array.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("Print out the element in the array at position 6, what happens?");
		//System.out.println(first_Array[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("Print out the element in the array at position -1, what happens?");
		//System.out.println(first_Array[-1]);
		
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < 6; i++) {
			System.out.println(first_Array[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int i: first_Array){
			System.out.println(i);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int i: first_Array){
			sum = sum + i;
		}
		System.out.println (" Array elements sum: " + sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum/first_Array.length;
		System.out.println (" Array elements Average: " + average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int i: first_Array){
			if (i % 2 != 0) {
				System.out.println(i);
				
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String [] arrayOfString = {"Sam", "Sally", "Thomas", "Robert" };
		
		// 12. Calculate the sum of all the letters in the new array
		
		int arrayOfStrSum = 0;
		for (String i: arrayOfString) {
			arrayOfStrSum = arrayOfStrSum + i.length();
		}
		System.out.println("Sum of letters in array " + arrayOfStrSum);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greeting1 ("Bernard");
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		System.out.println(greeting2("Bones"));
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		String aString = "Toussaint Louverture";
		int anInt = 6;
		
		if (testBooleanMethod(aString, anInt)) {
			System.out.println (" Yes, the number of letters in the string \" " +  aString + " \" is greater than the number \"" + anInt);
		}
		
		else {
		
		System.out.println (" No, the number of letters in the string \" " + aString + " \" is not greater than the number" + anInt);
		}
		
		anInt = 26;
		
		if (testBooleanMethod(aString, anInt)) {
			
			System.out.println (" Yes, the number of letters in the string \"" + aString + "\" is greater than the number " + anInt);
		}
		
		else {
		
			System.out.println (" No, the number of letters in the string \"" + aString + " \" is not greater than the number " + anInt);
		}
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		for (String i: arrayOfString) {
			System.out.print(i + " , ");
		}
		
		System.out.println();
		
		aString = "Jean Joseph" ;
		
		
		
		if (checkStringInArray(arrayOfString, aString)) {
			
			System.out.println ("Yes, \"" + aString + " is in the array of string");
			
		} else {
			System.out.println ("No, \"" + aString + " is not in the array of string");
			
		}
		
		aString = "Sally";
		
		if (checkStringInArray(arrayOfString, aString)) {
			
			System.out.println ("Yes, \"" + aString + " is in the array of string");
			
		} else {
			System.out.println ("No, \"" + aString + " is not in the array of string");
			
		}
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int intArray[] = {20, 54, 2, -3, 8, -5};
		
		for (int i: intArray) {
			System.out.print(i + " , ");
		}
		
		System.out.println();
		System.out.println(" Smallest value in array is: " + smallestInt(intArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double [] arrayOfDouble = {20, 54.5, 2, -3, 8.8, -5 };
		
		for (double i: arrayOfDouble) {
			System.out.print(i + " , ");
		}
		
		System.out.println();
		System.out.println(" Average of values in array is: " + averageOfDouble(arrayOfDouble));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int returnedArray [] = arrayOfStringLength(arrayOfString);
		for (String i: arrayOfString) {
			
			System.out.print(i + " ");
		}
		System.out.println();	
		
		for (int i: returnedArray) {
			
			System.out.print(i + " ");
		}
		System.out.println();		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String [] arrayOfString2 = {"Sam", "Sally", "Thomas", "Robert", "Tex", "Marco", "Fabio"  };
		
		for (String i: arrayOfString2) {
			
			System.out.print(i + ", ");
			
		}
		
		System.out.println();

		if (isEvenOrOddGreater(arrayOfString2)) {
			
			System.out.println(" Yes, sum of letters for all strings with an even amount of letters is greater");
		}
		else {
			
			System.out.println(" No, sum of letters for all strings with an even amount of letters is not greater");
		}
		
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		String [] aPalindromeString = {"Nurses Run", "Madam" , "kayaks" , "deified" , "rotators" , "repaper" , "deeds" , "peep" , "wow" , "noon"};
		
		
		for (String i: aPalindromeString) {
			
		if (isPalindrome(i)) {
		
			System.out.println(" Yes, " + i + " is a palindrome");
		
			}
		else {
			System.out.println(" No, " + i + " is not a palindrome");
			}
		}
		
		String theString = "drtkc!1$&";
		boolean passWordChecker = false;
		int length = theString.length();
		
		if (length >= 8){
			
			passWordChecker = true;
			
			for (int i = 0; i <= length -1; i++) {
				
				switch (theString.charAt(i)){
					case '!': 
					
					case '$':
						
					case '&':
						
					case '%':
						System.out.println ("passWordChecker;" + passWordChecker); 
				}
				
			}
			
	        
	    }
		
		
	}
	

	
	// Method 13: Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	
	public static void greeting1 (String aName) {
		System.out.println(" Hello " + aName);
	}


	// Method 14:Write and test a method that takes a String name and  
	//			returns a greeting.  Do not print in the method.

	public static String greeting2 (String aName) {
		return (" Hello " + aName);
	}
	// Method 15: Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	
	public static boolean testBooleanMethod (String aString, int anInt) {
		
		return ( aString.length() > anInt);
			
			
	}

	
	// Method 16: Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	
	public static boolean checkStringInArray (String [] aStringArray, String aString) {
		
		for (String i: aStringArray){
			
			if (i.equals(aString)) {
				return true;
			}
			
		}		
		return false;
			
	}
	

	
	// Method 17: Write and test a method that takes an array of int and 
	//			returns the smallest number in the array
	
	public static int smallestInt (int[] intArray) {
		
		int smallest = 0;
		for (int i: intArray) {
			
			if (smallest > i) {
				
				smallest = i;
			}
		
		}
		return smallest;
		
	}
	
	// Method 18:Write and test a method that takes an array of double and 
	//			returns the average
	public static double averageOfDouble (double[] doubleArray) {
		
		double average = 0;
		double sum = 0;
		for (double i: doubleArray) {
			
			sum = sum + i;
			}
		average = sum / doubleArray.length;
		
		return average;
		
	}
	
	// Method 19: Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position

	public static int [] arrayOfStringLength(String[] arrayOfString) {
		
		int [] stringLengths = new int [arrayOfString.length] ; 
		int index = 0;
		for (String i: arrayOfString) {
			
			stringLengths [index] = i.length();
			index++;
		}
		
		return stringLengths;
	}
	// Method 20: Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.
	
	public static boolean isEvenOrOddGreater(String [] arrayOfstring) {
		int sumEven = 0, sumOdd = 0;
		
		for (String i: arrayOfstring) {
			if (i.length() % 2 == 0) {
				sumEven = sumEven + i.length();
			}
			else {
				sumOdd = sumOdd + i.length();
			}
		}
		 if (sumEven > sumOdd)
			 return true;
		 
		return false;
	}
	
	
	// Method 21: Write and test a method that takes a string and 
	//			returns true if the string is a palindrome
	
	public static boolean isPalindrome(String aString) {
		
		int len = aString.length();
		int lastIndex = len-1;
		boolean isItOrNot = false;
		String localString = aString.toLowerCase();
		
		for (int i = 0; i <= len-1; i++) {
			
			if (i == lastIndex) {
				return isItOrNot;
			}
			
			if (localString.charAt(i) == ' ') {
				continue;
			}
			
			if (localString.charAt(lastIndex) == ' ') {
				lastIndex--;
			}
			
			if (localString.charAt(i) == localString.charAt(lastIndex)) {
				//System.out.println(localString.charAt(i));
				//System.out.println(localString.charAt(lastIndex));
				isItOrNot = true;
				lastIndex--;
				
			}
			else {
				isItOrNot = false;
			}
			
			
		}
		
		return isItOrNot;
	}

	/*
	 * Instructor Solutions
	 * 
	 * //
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Arrays & Methods
// Java Week 03 Lab Solution
//
package week03;

public class Week03ArraysAndMethodsLabSolution {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
		int[] array = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");
		System.out.println(array[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");
		System.out.println(array[array.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4:");
		// System.out.println(array[6]);

		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5:");
		// System.out.println(array[-1]);

		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
		for (int number : array) {
			System.out.println(number);
		}

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		System.out.println("\nQuestion 8:");
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		System.out.println("\nQuestion 9:");
		double average = sum / array.length;
		System.out.println(average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		System.out.println("\nQuestion 10:");
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		System.out.println("\nQuestion 11:");
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };
		for (String name : names) {
			System.out.println(name);
		}

		// 12. Calculate the sum of all the letters in the new array
		System.out.println("\nQuestion 12:");
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		
		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		System.out.println("\nQuestion 13:");

		greet("Tom");
		greet("Sally");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println("\nQuestion 14:");
		String greeting = greet2("Nick");
		System.out.println(greeting);

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println("\nQuestion 15:");
		System.out.println(isStringLongerThanNumber("Hello", 3));

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		System.out.println("\nQuestion 16:");
		System.out.println(doesArrayContainString(names, "Sam"));

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		System.out.println("\nQuestion 17:");
		System.out.println(findSmallestNumber(array));

		// 18. Write and test a method that takes an array of double and
		// returns the average
		System.out.println("\nQuestion 18:");
		double[] doubles = { 45.7, 30.2, 67.3 };
		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		System.out.println("\nQuestion 19:");
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		System.out.println("\nQuestion 20:");
		System.out.println(hasMoreEvenWordCharacters(names));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome
		System.out.println("\nQuestion 21:");
		System.out.println(isPalindrome("racecar"));

	}

	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}

	// Method 15:
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}

	// Method 16:
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}

	// Method 17:
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	// Method 18:
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}

	// Method 19:
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}

	// Method 20:
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;

		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}

		return evenLetters > oddLetters;
	}

	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
	 * 
	 * 
	 */

}
