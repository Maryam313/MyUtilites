import java.util.ArrayList;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class ArrayOfInteger {

	/**
	 * @param args
	 */
	
	int count=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array=-1;
		int arr[]=new int[] {101,88,3,65,6,3,0,0,88};
		int arr2[]=new int[arr.length];
		int count=1;

		for (int i = 0; i < arr.length; i++) {
		  for (int j = i + 1; j< arr.length; j++) {
		    if (arr[i] == arr[j]) {
		      count++;
		      //arr2[i] = array;
		    } 
		  }
		//  if (arr[i] != array) {
		 //   arr[i] = count;

		  }
		for (int i = 0; i < arr.length; i++) {
		  //if (arr[i] != array) {
			
		    System.out.println("Count of  " + arr[i] + " = " + count);
		  }
	}
}