import java.util.Scanner;

public class Exam06_9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오:");
        	
		int num = sc.nextInt();
		
			for(int j = num; j > 0; j--)
		        System.out.println(num + " x " + j + " = " + (num * j));
		}
			
		
	}

