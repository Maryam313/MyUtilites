import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.naming.spi.DirStateFactory.Result;
import javax.print.attribute.standard.OrientationRequested;
import javax.security.auth.kerberos.KerberosCredMessage;

import org.w3c.dom.ls.LSOutput;

/**
 * 
 */

/**
 * 1) How to identify even numbers/odd numbers: Given an arry of integers,
 * return the even and odd numbers INPUT: [2, 3, 7, 6, 9, 4, 5, 7] OUTPUT:
 * {'even': [2, 6, 4], 'odd': [7, 3, 9, 5, 7]}
 *
 * 
 */
public class Excercises {

	public static HashMap<String, ArrayList<Integer>> evenOrOdd(int[] arr) {
		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> Hsmap = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenNum.add(arr[i]);
			}
			if (arr[i] % 2 == 1) {
				oddNum.add(arr[i]);

				// System.out.println("odd:"+arr[i]);
			}

		}
		Hsmap.put("even:", evenNum);
		Hsmap.put("odd:", oddNum);

		System.out.println(Hsmap);

		return Hsmap;

	}

	/**
	 * 2) Calculate power, given the base and exponent. INPUT: {'base': 2,
	 * 'exponent': 3} OUTPUT: {'result': 8}
	 *
	 * 
	 */
	public static void power(int base, int exponent) {
		HashMap<String, Integer> power = new HashMap<String, Integer>();
		int result = base;
		for (int i = 1; i < exponent; i++) {
			result *= base;

			power.put("result:", result);
		}
		for (String k : power.keySet()) {
			System.out.println(k + "{" + power.get(k) + "}");
		}

	}

	/**
	 * 3) Reverse a string. INPUT: "this is a sentence" OUTPUT: "ecnetnes a si siht"
	 *
	 * 
	 */

public static String reverse(int rev,String st) {
	
	String rev1="";
	
	if(rev==st.length()) {
	return"";
	}else {
		System.out.print(st.charAt(rev));
	
}
	return reverse(rev+1,st) ;
}




//		// check if the input is empty..
//		if (st.isEmpty())
//			return st;
//		// Calling the function :
//		return reverse(st.substring(1)) + st.charAt(0);
//	}

	
	
	/**
	 * 4) Calculate factorial, given a positive number. INPUT: 5 OUTPUT: 120
	 *
	 * 
	 */

	public static int factorial(int num) {

		if (num == 0 || num == 1) {
			return 1;

		}
		return num * factorial(num - 1);

	}

	/**
	 * 5) Check if the string is palindrome or not. INPUT: "madam" OUTPUT: true
	 * 
	 * INPUT: "something" OUTPUT: false
	 *
	 * 
	 */
	public static boolean Palindrome(String st) {
		// if the input has one or 0 char ..
		if (st.length() == 0 || st.length() == 1) {
			return true;
		}
		// compare the first and last char..
		if (st.charAt(0) == st.charAt(st.length() - 1)) {

			return Palindrome(st.substring(1, st.length() - 1));
		}
		// if not equal will return false..
		return false;
	}

	/**
	 * 6) Take a number as input and print the increment decrement pattern
	 * 
	 * INPUT: 4
	 *  OUTPUT: "0 1 2 3 3 2 1 0"
	 *
	 * 
	 */
	
	
	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 7, 6, 9, 4, 5, 7 };
		System.out.println("\n------------Array------------------");
		String num2 = Arrays.toString(arr);
		System.out.println("Input  is:" + num2);
		System.out.println("------------Ex(1)---------------------");
		evenOrOdd(arr);

		System.out.println("------------Ex(2)---------------------");
		power(2, 3);

		System.out.println("------------Ex(3)---------------------");
		String st = "hello ";
		//reverse(st);
		int rev=1;
		String reverse = reverse(rev, st);
		System.out.println(": " + reverse);


		System.out.println("------------Ex(4)---------------------");
		int num = factorial(5);
		System.out.println("Factorial of 5:" + num);

		System.out.println("------------Ex(5)---------------------");
		String str1 = "madam";
		if (Palindrome(str1))
			System.out.println(str1 + ": true");
		else
			System.out.println(str1 + ": false");

		String str2 = "something";
		if (Palindrome(str2))
			System.out.println(str2 + ": true");
		else
			System.out.println(str2 + ": false");

		System.out.println("------------Done!---------------------");

	}

}
