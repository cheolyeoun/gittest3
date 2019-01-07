import java.util.Random;

/*
QuizRandom or ExamRandom

랜덤한 세자리 수를 표시합니다.
단 100의 자리와 수와 10의 자리의 수 1의 자리의 수는 같아서는 안됩니다.

Ex ) 
101 등 안됨 : 1이 두개임
777 등 안됨 : 7이 세개임

224 등 안됨 : 2가 두개임
233 등 안됨 : 3이 두개임
*/

public class Exam08_1 {

	public static void main(String[] args) {
		
	while(true) {
			
			Random randomV1 = new Random();
			Random randomV2 = new Random();
			Random randomV3 = new Random();
			
			
			if((randomV1 != randomV2)&&(randomV1 != randomV3))					
				if((randomV1 != randomV2)&&(randomV2 != randomV3))					
					if((randomV1 != randomV3)&&(randomV2 != randomV3))
				System.out.println(randomV1.nextInt(10));	
				System.out.println(randomV2.nextInt(10));
				System.out.println(randomV3.nextInt(10));
			break;
		
			}
	}
		}
	