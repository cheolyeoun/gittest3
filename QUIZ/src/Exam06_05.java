import java.util.Scanner;

public class Exam06_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int nSum = 0;       //합
		
		while (true) {
			//입력받기
			System.out.println("숫자 입력 :");
			int ninput = sc.nextInt(); 
			
			// 입력 받은 수 모두 더하기
			nSum += ninput;
			
			if (ninput==0) {	
				// 그리고 종료
				break;
			}
			System.out.println(nSum);
		}

	}

}
