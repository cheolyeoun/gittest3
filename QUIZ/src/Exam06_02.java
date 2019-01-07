import java.util.Scanner;

public class Exam06_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("각과목의 점수를 입력하시오");		 
		System.out.println("국어점수를 입력하시오:");
		int num1 = sc.nextInt();
		System.out.println("영어점수를 입력하시오:");
		int num2 = sc.nextInt();
		System.out.println("수학점수를 입력하시오:");
		int num3 = sc.nextInt();
		
		
		int avg = (num1 + num2 + num3) / 3;
		String sResult;    //알아보기 쉽게 하기 위해 대문자//
		
		if(avg > 90) 
			sResult = "A";
			
			else if (avg > 80)
			sResult = "B";
			
			else if (avg > 70)
			sResult = "C";
			
			else
			sResult = "F";
			
		System.out.println("3과목의평균점수는의 학점은" + sResult);
		
		}
}
