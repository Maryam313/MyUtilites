import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class ArrayofInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 12, 8, 1, 10, 10, 6, 87, 24 };
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length-1; i++) {

			if (numbers.containsKey(arr[i])) {

				numbers.put(arr[i], numbers.get(arr[i] )+ 1);

			} else {
				numbers.put(arr[i], 1);

			}
			System.out.println("Count of " + arr[i] + "is:" + numbers.get(arr[i]));
			//System.out.println(numbers);
		}

	}

}
