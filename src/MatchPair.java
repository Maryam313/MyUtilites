import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class MatchPair {

	public static int Sum(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		boolean valid = false;
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					
					System.out.println("[" + arr[i] + "," + arr[j] + "]");

					
				}
			}
			

		}
		return count;
	}

	public static void main(String[] args) {
		// ArrayList<Integer> arr = new ArrayList<Integer>();
		// arr.add(6);
		// arr.add(4);
		// arr.add(7);
		// arr.add(3);
		// arr.add(1);
		// arr.add(3);

		int target = 10;

		// for (Integer array : arr) {
		// System.out.print(array);
		// System.out.print(", ");
		// }
		// int[] arr = { 2, 3, 1, 8, 4, 6, 3 };
		int[] arr = {6, 4, 7, 3, 1,6};
		Sum(arr, target);
		System.out.println("\n--------------");
		String num2 = Arrays.toString(arr);
	 System.out.println("Input is:" + num2);

	}

}
