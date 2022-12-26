import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class MatchPairHash {
//One loop:
	public static HashMap<Integer,Integer> Sum(int[] arr, int target) {

		HashMap<Integer, Integer> sumption = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean valid = false;
			int el=target-arr[i];
			if (sumption.containsKey(arr[i])) {
				
				System.out.println("[" + arr[i] + ", " + sumption.get(arr[i]) + "]");
				// System.out.println("[" + arr[i] + ", " + el + "]");

				//sumption.put(el ,arr[i]);
				boolean valid1 = true;

				 } else if(!sumption.containsKey(arr[i])){
				
				 sumption.put(el ,arr[i] );
				 }
			}
		return sumption;
					

	}
	
	
//	public static int Sum2(int[] arr, int target) {
//		HashMap<Integer, Integer> sumption1 = new HashMap<Integer, Integer>();
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//		boolean valid = false;
//			for (int j= i + 1; j < arr.length -1; j++) {
//				if (sumption1.containsKey(arr[i])) {
//					
//					System.out.println("[" + arr[i] + ", " + sumption1.get(arr[i]) + "]");
//
//					sumption1.put(arr[i], j);
//					
//					 } else if(!sumption1.containsKey(arr[i])){
//						 
//					 sumption1.put(target-arr[i], arr[j]);
//					 }
//				}					
//					System.out.println("[" + arr[i] + "," + arr[i] + "]");
//
//					
//				}
//			
//			
//
//		
//		return count;
//	}

	public static void main(String[] args) {
		int target = 10;
		
		//int[] arr = {6,7,4,3,4,5,6};
		//int[] arr = new int []{6,6,7,4,4,4,3,5,6,4};
		//int[] arr = new int []{6,6,6,4,4,4,4,6,6};
		int[] arr = new int []{6,6,6,4,4,};


		
		System.out.println("\n--------------");
		String num2 = Arrays.toString(arr);
		System.out.println("Input  is:" + num2);
		// System.out.println(Sum(arr, target));
		System.out.println("\n--------------");
		Sum(arr,target);
	//	Sum2(arr, target);
	}

}
