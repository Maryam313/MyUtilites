import java.security.PublicKey;
import java.util.Arrays;

/**
 * 
 */

/**-----------------------------------------------------------------------
 * @author Q1:Write a method, that takes an array as input and returns the largest number as output..
 * Array:[50,12,8,10,1001,6,87,24]
 * Output: 1001
 * Q2:
 * Array:[50,12,8,10,1001,6,87,24]
 * Output: [1001,87]
 * 
 * Q3: Find largest,2nd largest and 3rd largest number in an array of integers:
 * Array: [50,12,8,10,1001,6,87,24]
 * Output: [1001,87,50]
 *	
 * 
 * [4,5,7,8]
 *
 *
 *------------------------------------------------------------------------
*/
public class LargestNum {

		public static int LargestNo(int []arr) {
			//int arr[]=  {50,12,8,10,1001,6,87,24};
			int largest=arr[0];
			for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
			largest=arr[i];
			}
				
			}
			return largest;
			
		}
		
		

			public static int LargestNo2(int []arr) {
				int secondLargest=0;
				int largest=arr[0];
				
				for (int i = 0; i < arr.length; i++) {
				if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				}else if (arr[i]>secondLargest) {
				secondLargest=arr[i];
					

				}
				}
				
					return secondLargest;
				}
			
				public static int [] LargestNo3(int []arr) {
					int secondLargest=arr[0];
					int largest=arr[0];
					int ThirdLargest=arr[0];
					
					for (int i = 0; i < arr.length; i++) {
					if(arr[i]>largest) {
					secondLargest=largest;
					largest=arr[i];
					} else if (arr[i]>secondLargest) {
					secondLargest=arr[i];
					}
					else if (arr[i]>ThirdLargest) {
						ThirdLargest=secondLargest;
					
						ThirdLargest=arr[i];
						
					}
					}
				
					 int [] number = new int [3];
					number [0]=secondLargest;
					number[1]=ThirdLargest;
					
					
					
					
			
					return number;
				}
	public static void main(String[] args) {
					int arr[]=  {50,12,8,10,1001,6,87,24};
					int num=arr.length;
					String num1=Arrays.toString(arr);
					System.out.println(num1);
					int [] number=LargestNo3(arr);
					

			System.out.println("---------->>-----------");
		// int num = LargestNo2();
			System.out.println("The largest Number is:"+LargestNo(arr));
			System.out.println("---------->>-----------");
			System.out.println("The largest Number is:"+"["+LargestNo(arr)+","+LargestNo2(arr)+"]");
			System.out.println("---------->>-----------");
			System.out.println("The largest Number is:"+"["+LargestNo(arr)+","+number[0]+","+number[1]+"]");


		int[] arr1 = new int[2];
			System.out.println("[" + arr1 [0] + "," + arr1[1]+"]");

	}
			
		}
		
																									