import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/*
세 개의 정수를 입력 받아서 앞의 두 수는 연산에 이용하고 세 번째 수는 연산자로 사용한다.
세번째 인수가 1이면 +, 2이면 -, 3이면 *, 4이면 / 연산을 한다. 그 외의 수가 들어오면 다시 전체 입력을 받는다.
각 각의 연산은 메서드로 만들어 호출한다.
*/


public class Exam07_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("세 개의 정수를 차례로 입력하시오");		
		    
		while(true) {
		    
		    
			System.out.println("첫번째 정수를 입력하시오:");
			int num1 = sc.nextInt();
			
			System.out.println("두번째 정수를 입력하시오:");
			int num2 = sc.nextInt();
			
			System.out.println("1: 더하기 2: 빼기 3:곱하기 4: 나누기) :");
			int num3 = sc.nextInt();			
			
		
			if (num3 >= 1 && num3 <= 4) {
				// 전체 다시, 정수만 입력했다고 가정.
				// 매서드 호출하고..
				break;
				//  while  종료
			}	
		}		
	}
	
	public static void Calc(int num1, int num2, int num3) {
        switch (num3) {
		case 1: // 더하기
			System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
			break;
		case 2: // 빼기
			System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
			break;	
		case 3: // 곱하기
			System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
			break;	
		case 4: // 나누기
			System.out.printf("%d / %d = %f \n", num1, num2, (double)num1 / num2);
			break;	
			
		default:
			break;
		}
	}
}
