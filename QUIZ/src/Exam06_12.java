import java.io.PrintStream;
import java.util.Scanner;

public class Exam06_12 {

	private static PrintStream printf;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
       int sum = 0; 		
        		
		System.out.println("첫번째 정수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오:");
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {  
					System.out.print(num1+"+");
					sum = sum + num1++;
				}
			 }
		if(num1 > num2) {					
			for(int j = num2; j >= num1; j--) { 
					System.out.print(num1+"+");	 
					sum = sum + num1--;
				}
			}
						
			 System.out.print("\b="+sum);
				
	}
                     
}