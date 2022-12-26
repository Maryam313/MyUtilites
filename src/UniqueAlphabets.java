import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 * 
 */

/**
 * @author 1)-Find unique alphabets in an array..
 * Input:['c','a','c','t','r','a','t','z']
 * Output:['c','a','t','r','z']
 * use array& Hashmap - see if u find a difference!
 *
 */
public class UniqueAlphabets {


	public static char[] uniqueAlpha(char[] arr) {
				
		for (int i = 0; i < arr.length; i++) {
			boolean valid =false;
		for (int j =i+1; j<arr.length&&valid==false; j++) {
				if (arr[i]==arr[j]) {
					valid=true;
				}else if(!valid) {
					System.out.println(arr[i]);
				}
		}	
		}
		
		return arr;
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = new char[] { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z'};
		char[] ch =uniqueAlpha(arr);
		System.out.println(uniqueAlpha(arr));
		String num2 = Arrays.toString(arr);
		System.out.println("Output  is:" + num2);
	}

}
