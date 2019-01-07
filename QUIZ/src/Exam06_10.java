import java.util.Scanner;

public class Exam06_10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("첫번째 정수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오:");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수를 입력하시오:");
		int num3 = sc.nextInt();
		System.out.println("네번째 정수를 입력하시오:");
		int num4 = sc.nextInt();
		System.out.println("다섯번째 정수를 입력하시오:");
		int num5 = sc.nextInt();
        
		int num;
		int nSum = 0;
		nSum = nSum + num;
        int i = 0;
        
        while(nSum < 5) 
        System.out.println("숫자입력:");
        num = sc.nextInt();	
        if(num<1) {
        	System.out.println("숫자가 작습니다. 재입력주세요.");
      
        
        i++;
        
        
	    System.out.println("합: " + nSum);   	
		

        }
		
//	result = num1 + num2 + num3 + num4 + num5;	
//	System.out.println(result);	
	}	
}
	