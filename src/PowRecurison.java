import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/**
 * 
 */

/**
 * @author LAP-2
 *
 */
public class PowRecurison {

	public static int pow(int base,int exp) {
	
		System.out.println(base+""+exp);
		//int res=pow(base, exp);
		int result = base;
		for (int i = 1; i < exp; i++) {
			result *= base;
		//return pow(base, exp);
		
		}
		return result;
	
	}
//	if(exp==0) {
//		return 1;
//	}
//		return base*pow(base, exp-1);
//	}

	
	public static int fac(int num) {
		
		if (num == 0) {
			return 1;

		}
		return num * fac(num - 1);

	}
	
	/**
	 * 6) Take a number as input and print the increment decrement pattern
	 * 
	 * INPUT: 4
	 *  OUTPUT: "0 1 2 3 3 2 1 0"
	 *
	 * 
	 */
	
	
	public static int revNum(int num) {
		if(num==5) {
			return 0;
		}else
			{
			System.out.print(num);
			
				 revNum(num+1);

		System.out.print(num--);
			}
		return num;
	
	}
	
	
	//for loop:
	
	
	public static int revNum1(int num) {
		if(num==5) {
		
			//System.out.print(num);
			 for (int i = 0; i <5; i++) {  
		           System.out.print(i + " ");  
			 }
		           for (int i = num; i > 0; i--) {
		               //System.out.print( +i + " ");
			       // System.out.print(j + " ");
			// for (int i = num-1; i >= 5; i--) {  
		          System.out.print(i+ " ");  
		        }  
			
			
			}
		return num;
	
	}
	/**
	 * 7) Generate Fabonacci series.
INPUT: 8
OUTPUT: 0 1 1 2 3 5 8 13
	 *
	 * 
	 */
	
	public static int fibonacci(int num){
		if(num == 0){
			return 0;
		}
		else if(num == 1 ){
				return 1;
			}
		return fibonacci(num-2) + fibonacci(num-1);
		}
	
	
	public static void main(String[] args) {
		int num=0;
		//System.out.println(pow(2,3));
	//	int num = pow(2,3);
		//System.out.println("recurison:" + num);	}
		//int num = fac(5);
		//System.out.println("Factorial of 5:" + num);
		int num1 = revNum(num);
		System.out.println("" + num1);
		int num2 = revNum1(5);
		System.out.println("" + num2);
		
		
		int num11 = 8;
		System.out.print("Fibonacci:");
		for(int i = 0; i < num11; i++){
				System.out.print(fibonacci(i) +" ");
			}
}
}





