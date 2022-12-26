import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class UniqueAlphaHash {

	public static HashMap<Character, Integer> uniqueAlpha(char [] arr) {
	HashMap<Character, Integer> uniqueAlpha = new HashMap<Character, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			uniqueAlpha.put(arr[i],0);
		}
		return uniqueAlpha;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[] = new char[] { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z'};

		
		
		System.out.println(uniqueAlpha(arr).keySet());
		
		
		
		
	

		
		
	}

}
