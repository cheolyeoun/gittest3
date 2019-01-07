import java.util.Scanner;

	public class Exam06_03 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
			    System.out.println("정수를 입력하시오.");		 
				int num = sc.nextInt();
		        
				int result = 1;
		        
				
				while(0<num) {
				
				System.out.printf("%d = ",num);	
					
				if ( num==1) {
				System.out.print(num + " +  ");
				}else {
			    System.out.print(num + " +  ");
					
				}
					
					
				result*=num;  ///  result = result * num;
				num--;                // 수정하자

	              }
				System.out.printf("%d" ,result);
			}
	}
