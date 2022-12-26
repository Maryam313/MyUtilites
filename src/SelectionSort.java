import java.util.Arrays;

/**
 * 
 */

/**-----------------------------------------------------------------
 * @author Q: Sort a given array of numbers in Decending order:
 *         Array:[50,12,8,10,1001,6,87,24] Output:[1001,87,50,24,12,10,8,6]
 *-------------------------------------------------------------------
 */
public class SelectionSort {

	/**
	 * @param args
	 *
	 */
	public static int[] maxValue(int[] arr) {

		// int largestNum=arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			int maxindex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[maxindex] < arr[j]) {

					// largestNum=arr[i];
					maxindex = j;
				}

			}
			// call the swapping fun
			swapping(arr, i, maxindex);

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

		// int arr[]= {4,3,2,1};
		int arr[] = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		// System.out.println(arr);
		// Arrays.sort(arr);
		String num1 = Arrays.toString(arr);
		System.out.println("Array :" + num1);
		// System.out.println("The Max Value is:"+maxNum(arr));
		maxValue(arr);
		String num2 = Arrays.toString(arr);
		System.out.println("Output  is:" + num2);
	}

}
