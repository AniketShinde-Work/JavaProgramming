package JavaProgramming;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt(); //1234
		
		//1. Using algorithm
		/*int rev=0;
		
		while(input!=0)
		{
			rev=rev*10+input%10; //0+1234%10=4  40+3=43  430+2=432  4320+1=4321
			input=input/10; //1234/10=123  123/10=12  12/10=1  1/10=0
		}*/
		
		//Using string buffer
		StringBuffer sb = new StringBuffer(String.valueOf(input));
		StringBuffer rev= sb.reverse();
		
		System.out.println("rev is "+rev);

	}

}
