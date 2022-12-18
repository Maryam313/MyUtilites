import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Take the input and then count the no. of vowel letter...
 *
 */
public class Vowel {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				int count = 0;

		// Ask the user to enter Sentence:>>
		System.out.println("---------->><<------------");
		System.out.println("Please Enter the sentence:");
		System.out.println("---------->><<------------");
		
		String st = scan.nextLine();

		HashMap<String,Integer> vowelLetter=new HashMap<String, Integer>();
		vowelLetter.put("a",0);
		vowelLetter.put("o",0);
		vowelLetter.put("e",0);
		vowelLetter.put("i",0);
		vowelLetter.put("u",0);

		
		
		
		
	//public int CountLetter(String st) {
	
		for (int i = 0; i < st.length(); i++) {
		char ch = st.charAt(i);
		 if (ch == 'a') {
			 vowelLetter.put("a",vowelLetter.get("a")+1);
	 		 count++;
		 }else if(ch == 'o') {
			 vowelLetter.put("o",vowelLetter.get("o")+1);
	 		 count++;
		 }else if(ch == 'e') {
			 vowelLetter.put("e",vowelLetter.get("e")+1);
	 		 count++;
		 }else if(ch == 'i') {
			 vowelLetter.put("i",vowelLetter.get("i")+1);
	 		 count++;
		 }else if(ch == 'u') {
			 vowelLetter.put("u",vowelLetter.get("u")+1);
	 		 count++;
		 }
		}
		
				 
		
		System.out.println("----------------------");
		System.out.println("Count of (a) letter is:"+vowelLetter.get("a"));
		System.out.println("Count of (o) letter is:"+vowelLetter.get("o"));
		System.out.println("Count of (u) letter is:"+vowelLetter.get("u"));
		System.out.println("Count of (i) letter is:"+vowelLetter.get("i"));
		System.out.println("Count of (e) letter is:"+vowelLetter.get("e"));
		System.out.println("Count of (vowel) letter is:"+count);


			
		
		//return count;
	
}
}