import java.util.Scanner;

public class Exam02_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오:");
		int num2 = sc.nextInt();

		
		int sum = num1 / num2;
		int sum2 = num1 % num2;
	
		
		System.out.printf("나누기 %d 의 몫은 %d 입니다. \n", num2, sum);
		System.out.printf("나누기 %d 의 나머지는 %d 입니다. \n", num2, sum2);
	}

}
