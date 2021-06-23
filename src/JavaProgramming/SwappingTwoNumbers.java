package JavaProgramming; 
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		System.out.println("Before Swapping-value of a="+a+" b="+b);
		//Logic 1- Third Variable;
		/*int t=a;
		a=b;
		b=t;
		*/
		
		//Logic 2 using + and - operator and without using third variable
		/*a=a+b;	//10+20=30;
		b=a-b;		//30-20=10;
		a=a-b;	//30-10=20 */
		
		//Logic 3 using * and / operator and without using third variable
		//here a and b value should not be zero;
		
		/*a=a*b;	//10*20=200;
		b=a/b;	//200/20=10;
		a=a/b;	//20/10=20; */
		
		//logic 4- using single statement
		
		b=a+b-(a=b);
	
		
		System.out.println("After Swapping-value of a="+a+" b="+b);
		
		
	}

}
