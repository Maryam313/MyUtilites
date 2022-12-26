import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean validSort = true;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] < arr[j+1]) {

					// Call the swap fun
					swapping(arr, j, j + 1);

				}
				
			}
			for (int s: arr) {
				System.out.print(s);
				validSort = false;
			}
			System.out.println();

		}

		return arr;
	}

	// swap method
	public static void swapping(int[] s, int x, int y) {
		int temp = s[x];
		s[x] = s[y];
		s[y] = temp;
	}

	public static void main(String[] args) {

		// int arr[] = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String num1 = Arrays.toString(arr);
		System.out.println("Array :" + num1);

		// CALL THE FUNC..
		bubbleSort(arr);
		String num2 = Arrays.toString(arr);
		System.out.println("Output  is:" + num2);
	}

}
