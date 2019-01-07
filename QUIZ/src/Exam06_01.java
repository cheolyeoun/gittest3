import java.util.Scanner;

public class Exam06_01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
		    System.out.println("두개의 정수를 차례로 입력하시오");		 
			System.out.println("첫번째 정수를 입력하시오:");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수를 입력하시오:");
			int num2 = sc.nextInt();

            int result = num1 - num2;	
            int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
            
            if(num1>num2)
            System.out.println(result);
           
            else
        	   System.out.println(diff);
        		
		/* int diff = num1 - num2 
            if(diff<0)
             diff= diff * -1
        */
           
		}

	}
		

