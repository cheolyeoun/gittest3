//1,2,3중 하나의 숫자를 난수로 생성한다.
//사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
//승부를 판단하여 출력한다.
//1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려준다.
import java.util.Random;
import java.util.Scanner;

public class QuizRPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num2;
		
		while(true) {
		System.out.println("무엇을 내겠습니까?숫자를 입력하세요.(1:가위, 2:바위, 3:보)");
		num2 = sc.nextInt();
		if(num2 > 0&& num2 < 4)
		break;
		}	

		Random rand = new Random();	
			int num1 = rand.nextInt(4);  // 0~3
			if(num1 > 0 && num1 < 4)
				
			
				System.out.println(num1); 
			
			switch (num2) {
			case 1:
				System.out.println("비겼습니다");
				break;
			case 2:
				System.out.println("이겼습니다");
				break;
			case 3:
				System.out.println("졌습니다");
				break;	
				default:

			
			}

	}

}
