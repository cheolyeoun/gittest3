import java.util.Scanner;

public class Exam06_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result;
		
	    System.out.println("3개의 정수를 입력하시오");		 
		
	    
	    int nMax = sc.nextInt();
	    double nSum = 0.0;
	    for (int i=0; i<nMax; i++) {
	    	int num = sc.nextInt();
	    	nSum = nSum + num;
	    }
	    double nAvg = nSum / nMax;
	    
	    System.out.println("평균은 :" +nAvg);
	    
	    
	    
	    
	    System.out.println("1번 정수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("2번 정수를 입력하시오:");
		int num2 = sc.nextInt();
		System.out.println("3번 정수를 입력하시오:");
		int num3 = sc.nextInt();
			
		result =  num1 + num2 + num3; 
		
		
		
	}

}
