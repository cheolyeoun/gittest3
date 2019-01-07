import java.util.Scanner;

public class Exam02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오:");
		int num2 = sc.nextInt();

		
		int sum = num1 + num2;
		int sum2 = num1 - num2;
		int sum3 = num1 * num2;
		int sum4 = num1 / num2;
		
		System.out.printf("두수의 더하기 = %d \n", sum);
		System.out.printf("두수의 빼기 = %d \n", sum2);
		System.out.printf("두수의 곱하기 = %d \n", sum3);
		System.out.printf("두수의 나누기 = %d \n", sum4);

	}

}